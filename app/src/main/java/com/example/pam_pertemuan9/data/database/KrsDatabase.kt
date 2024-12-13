package com.example.pam_pertemuan9.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.pam_pertemuan9.data.dao.MahasiswaDao
import com.example.pam_pertemuan9.data.entity.Mahasiswa

//Mendefinisikan database dengan tabel Mahasiswa
@Database(entities = [Mahasiswa::class], version = 1, exportSchema = false)
abstract class KrsDatabase : RoomDatabase() {

    // Mendefinisikan fungsi untuk mengkases data Mahasiswa
    abstract fun mahasiswaDao(): MahasiswaDao

    companion object {
        @Volatile // Memastikan bahwa nilai variabel Instance selalu sama di semua Thread
        private var Instance: KrsDatabase? = null

        // Membuat database
        fun getDatabase(context: Context): KrsDatabase {
            return (Instance ?: synchronized(this) {
                Room.databaseBuilder(
                    context,
                    KrsDatabase::class.java, // Class database
                    "KrsDatabase" // Nama database
                )
                    .build().also { Instance = it }
            })
        }
    }
}