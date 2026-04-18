import net.fabricmc.loom.task.RemapJarTask

plugins {
    id("fabric-loom") version "1.6-SNAPSHOT"
    id("maven-publish")
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
    maven("https://maven.terraformersmc.com/") {
        name = "TerraformersMC"
    }
}

loom {
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
    mappings("net.fabricmc:yarn:${project.property("yarn_mappings")}:v2")
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
    modImplementation(files("cntrafficsymbols_core-0.0.2-b2.jar"))
    modImplementation("com.terraformersmc:modmenu:9.2.0") {
        exclude(group = "eu.pb4", module = "placeholder-api")
    }
    implementation(files("nbtutils-0.0.1a1.jar"))
    modImplementation(files("nbtutils_bridge_mc-0.0.1-a1.jar"))
    modImplementation(files("number_id_revival-0.0.1-a1+mc1.20.4.jar"))
}

tasks.withType<JavaCompile>().configureEach {
    options.release = 17
}

java {
    // Loom will automatically attach sourcesJar to a RemapSourcesJar task and to the "build" task
    // if it is present.
    // If you remove this line, sources will not be generated.
    withSourcesJar()

    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

val extraResourcesPath: String = "src/main/extra-resources"

tasks.jar {
    from("LICENSE") {
        rename {
            "${it}_${base.archivesName.get()}"
        }
    }
    from("LICENSE_Unifont")
}

tasks.register<Jar>("extraJar") {
    description = "Jar with extra-resources. Will be removed in 0.0.3-a1."
    from(zipTree(tasks.named<RemapJarTask>(
        "remapJar"
    ).get().archiveFile.get().asFile.path))
    from(extraResourcesPath)
    dependsOn(tasks.named("remapJar").get())
    archiveClassifier = "full"
}

tasks.build {
    dependsOn(tasks.named("extraJar"))
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
