package com.example.pam_pertemuan9.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

// Membuat tabel mahasiswa
@Entity(tableName = "mahasiswa")
data class Mahasiswa(

    // Memberikan PrimaryKey kepada nim dengan menambahkan @PrimaryKey diatas val nya
    @PrimaryKey
    val nim : String,

    val nama: String,
    val alamat: String,
    val jenisKelamin: String,
    val kelas: String,
    val angkatan: String
)
