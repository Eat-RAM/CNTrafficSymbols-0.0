plugins {
    id("net.fabricmc.fabric-loom-remap") version "1.18-SNAPSHOT"
    `maven-publish`
}

version = project.property("mod_version") as String
group = project.property("maven_group") as String

base {
    archivesName = project.property("archives_base_name") as String
}

repositories {
    // Add repositories to retrieve artifacts from in here.
    // You should only use this when depending on other mods because
    // Loom adds the essential maven repositories to download Minecraft and libraries from automatically.
    // See https://docs.gradle.org/current/userguide/declaring_repositories.html
    // for more information about repositories.
    maven("https://repo.codemc.io/repository/relativitymc/")
    maven("https://maven.terraformersmc.com/") {
        name = "TerraformersMC"
    }
}

loom {
    useIntermediateMappings = true
    intermediaryUrl = $$"https://repo.codemc.io/repository/relativitymc/org/relativitymc/intermediary/%1$s/intermediary-%1$s-v2.jar"

    splitEnvironmentSourceSets()

    mods {
        create("cntrafficsymbols_0.0") {
            sourceSet(sourceSets.main.get())
            sourceSet(sourceSets.named("client").get())
        }
    }
}

dependencies {
    // To change the versions see the gradle.properties file
    minecraft("com.mojang:minecraft:${project.property("mc_version")}")
    mappings(
        "org.relativitymc:modern-yarn:${project.property("yarn_mappings")}:v2"
    )
    modImplementation(
        "net.fabricmc:fabric-loader:${project.property("loader_version")}"
    )

    // Fabric API. This is technically optional, but you probably want it anyway.
    modImplementation("net.fabricmc.fabric-api:fabric-api:${
        project.property("fabric_api_version")
    }")
    
    // Uncomment the following line to enable the deprecated Fabric API modules. 
    // These are included in the Fabric API production distribution and allow you to update your mod to the latest modules at a later more convenient time.

    // modImplementation("net.fabricmc.fabric-api:fabric-api-deprecated:${project.fabric_version}")
    modImplementation(files(
        "cntrafficsymbols_core-0.0.3-a1+mc26.3.jar"
    ))
    modImplementation("com.terraformersmc:modmenu:21.0.0-beta.1")
    //implementation(files("nbtutils-0.0.1a1.jar"))
    //modImplementation(files("nbtutils_bridge_mc-0.0.1-a1.jar"))
    //modImplementation(files("number_id_revival-0.0.1-a1+mc1.20.4.jar"))
}

tasks.withType<JavaCompile>().configureEach {
    options.release = 25
}

java {
    // Loom will automatically attach sourcesJar to a RemapSourcesJar task and to the "build" task
    // if it is present.
    // If you remove this line, sources will not be generated.
    withSourcesJar()

    sourceCompatibility = JavaVersion.VERSION_25
    targetCompatibility = JavaVersion.VERSION_25
}

val extraResourcesPath: String = "src/main/extra-resources"

tasks.jar {
    from("LICENSE") {
        into("META-INF")
    }
    from("LICENSE_Unifont") {
        into("META-INF")
    }
}

tasks.named<Jar>("sourcesJar") {
    from("LICENSE") {
        into("META-INF")
    }
    from("LICENSE_Unifont") {
        into("META-INF")
    }
}

// configure the maven publication
publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }

    // See https://docs.gradle.org/current/userguide/publishing_maven.html for information on how to set up publishing.
    repositories {
        // Add repositories to publish to here.
        // Notice: This block does NOT have the same function as the block in the top level.
        // The repositories here will be used for publishing your artifact, not for
        // retrieving dependencies.
    }
}

val isWindowsOs = org.apache.tools.ant.taskdefs.condition.Os.isFamily(
    org.apache.tools.ant.taskdefs.condition.Os.FAMILY_WINDOWS
)
val defaultPythonExecutable = project.findProperty("pythonCmd") as? String
    ?: System.getenv("PYTHON")
    ?: if (isWindowsOs) "python" else "python3"

val generateAssets = tasks.register<Exec>("generateAssets") {
    group = "generation"
    description = "Regenerates all JSON assets using Python generator scripts."
    commandLine(defaultPythonExecutable, "-m", "reg.generate_all", "src/main/resources")
}

val verifyAssets = tasks.register<Exec>("verifyAssets") {
    group = "verification"
    description = "Verifies that all generated JSON assets are in sync with Python generator scripts."
    commandLine(defaultPythonExecutable, "-m", "reg.generate_all", "src/main/resources", "--dry-run")
}

tasks.named("check") {
    dependsOn(verifyAssets)
}
