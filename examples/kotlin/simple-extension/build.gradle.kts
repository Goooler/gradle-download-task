/**
 * Include the gradle-download-task plugin
 */
plugins {
    id("de.undercouch.download") version "5.6.0"
}

import de.undercouch.gradle.tasks.download.Download

/**
 * Use the extension to download a single file
 */
tasks.register("downloadFile") {
    doLast {
        download.run {
            src("https://repo.maven.apache.org/maven2/org/citationstyles/styles/1.0/styles-1.0.jar")
            dest(layout.buildDirectory)
            overwrite(true)
        }
    }
}

defaultTasks("downloadFile")
