package com.example.pam_pertemuan9.repository

import com.example.pam_pertemuan9.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

// Interface semacam panduan
// Setelah dari sini lanjut ke LocalRepositoryMhs
interface RepositoryMhs {

    fun getAllMahasiswa() : Flow<List<Mahasiswa>>

    fun getMhs(nim : String): Flow<Mahasiswa>

    // Suspend digunakan untuk operasi yang berat seperti Create, Delete, Insert
    suspend fun insertMhs(mahasiswa: Mahasiswa)

    suspend fun deleteMhs(mahasiswa: Mahasiswa)

    suspend fun updateMhs(mahasiswa: Mahasiswa)

}