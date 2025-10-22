pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    // Modo de repositórios: falhar se houver repositórios definidos no build.gradle.kts do módulo
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io") // Adicionado suporte ao JitPack para dependências externas
    }
}

// Nome do projeto raiz
rootProject.name = "Maiêutica Students"

// Inclusão de módulos
include(":app")
