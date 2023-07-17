val lets_plot_kotlin_version: String by project

plugins {
    id("org.jetbrains.kotlin.js") version "1.8.22"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.lets-plot:lets-plot-kotlin-js:$lets_plot_kotlin_version")
    testImplementation("org.jetbrains.kotlin:kotlin-test-js")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.2")
}

kotlin {
    js(IR) {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport {
                    enabled.set(true)
                }
            }
        }
    }
}

