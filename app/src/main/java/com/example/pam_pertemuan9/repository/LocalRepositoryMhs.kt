package com.example.pam_pertemuan9.repository

import com.example.pam_pertemuan9.data.dao.MahasiswaDao
import com.example.pam_pertemuan9.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

// Implementasi dari RepositoryMhs
class LocalRepositoryMhs(
    private val mahasiswaDao: MahasiswaDao) :
    RepositoryMhs
{

    override fun getAllMahasiswa(): Flow<List<Mahasiswa>> {
        return mahasiswaDao.getAllMahasiswa()
    }

    override fun getMhs(nim: String): Flow<Mahasiswa> {
        return mahasiswaDao.getMahasiswa(nim)
    }

    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }

    override suspend fun deleteMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.deleteMahasiswa(mahasiswa)
    }

    override suspend fun updateMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.updateMahasiswa(mahasiswa)
    }

}