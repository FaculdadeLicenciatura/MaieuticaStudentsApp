// Arquivo de configuração de nível superior
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    id("org.jetbrains.kotlin.kapt") version "1.8.22" apply false // Certifique-se da versão do Kotlin
}

allprojects {
    configurations.all {
        resolutionStrategy {
            force("org.xerial:sqlite-jdbc:3.34.0") // Força o uso da versão específica
        }
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
