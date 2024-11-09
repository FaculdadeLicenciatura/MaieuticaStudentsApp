plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.goncalogarrido.maiuticastudents"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.goncalogarrido.maiuticastudents"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // AndroidX core and lifecycle
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)

    // Compose dependencies
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)

    // Testing dependencies
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    // Navigation and ViewModel
    implementation("androidx.navigation:navigation-compose:2.5.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.5.0")

    // Icons and UI enhancements
    implementation("io.coil-kt:coil-compose:2.1.0")
    implementation("androidx.compose.material:material-icons-extended:1.4.3")
    implementation("com.google.accompanist:accompanist-placeholder-material:0.24.0-alpha")

    // Markdown support
    implementation("io.github.jeziellago:compose-markdown:0.2.3")
    implementation("org.commonmark:commonmark:0.18.2")

}

// Para evitar conflitos de dependências
configurations {
    all {
        exclude(group = "org.commonmark", module = "commonmark")
    }
}
