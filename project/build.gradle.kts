plugins {
    id("org.jetbrains.kotlin.js") version "1.4.10"
}

group = "com.kalai"
version = "1.0-SNAPSHOT"


repositories {
    maven { setUrl("https://dl.bintray.com/kotlin/kotlin-eap") }
    maven("https://kotlin.bintray.com/kotlin-js-wrappers/")
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-js"))

    implementation("org.jetbrains:kotlin-react:16.13.1-pre.110-kotlin-1.4.0")
    implementation("org.jetbrains:kotlin-react-dom:16.13.1-pre.110-kotlin-1.4.0")
    implementation(npm("react", "16.13.1"))
    implementation(npm("react-dom", "16.13.1"))

    implementation ("org.jetbrains:kotlin-styled:5.2.0-pre.129-kotlin-1.4.20")

    implementation(npm("styled-components", "~5.1.1"))
    implementation(npm("inline-style-prefixer", "~6.0.0"))


    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9")
}


kotlin {
    js {
        browser {
            webpackTask {
                cssSupport.enabled = true
            }

            runTask {
                cssSupport.enabled = true
            }

            testTask {
                useKarma {
                    useChromeHeadless()
                    webpackConfig.cssSupport.enabled = true
                }
            }
        }
        binaries.executable()

    }
}

task("copyOutputToDocs"){
    val outputFolder = File("build/distributions")
    val docFolder = File("../docs")
    if(outputFolder.exists())
        outputFolder.copyRecursively(docFolder,true)}

task("runScreenshotScript"){
    val workingDir = File("src/main")
    ProcessBuilder("python3","screenshot_script.py")
        .directory(workingDir)
        .redirectOutput(ProcessBuilder.Redirect.INHERIT)
        .redirectError(ProcessBuilder.Redirect.INHERIT)
        .start()
        .waitFor(15, TimeUnit.SECONDS)

}





