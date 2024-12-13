package com.example.pam_pertemuan9

import android.app.Application
import com.example.pam_pertemuan9.dependenciesinjection.ContainerApp

class KrsApp : Application() {

    // Fungsinya untuk menyimpan Instance ContainerApp
    lateinit var containerApp: ContainerApp
    override fun onCreate() {

        super.onCreate()
        // Membuat Instance ContainerApp

        containerApp = ContainerApp(this)
        // Instance adalah object yang dibuat dari class
    }
}