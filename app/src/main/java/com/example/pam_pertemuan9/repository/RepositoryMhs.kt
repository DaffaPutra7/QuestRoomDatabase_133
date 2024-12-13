package com.example.pam_pertemuan9.repository

import com.example.pam_pertemuan9.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

// Interface semacam panduan
// Setelah dari sini lanjut ke LocalRepositoryMhs
interface RepositoryMhs {

    // Suspend digunakan untuk operasi yang berat seperti Create, Delete, Insert
    suspend fun insertMhs(mahasiswa: Mahasiswa)
    fun getAllMahasiswa() : Flow<List<Mahasiswa>>
}