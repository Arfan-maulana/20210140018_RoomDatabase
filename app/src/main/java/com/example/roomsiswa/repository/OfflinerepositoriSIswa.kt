package com.example.roomsiswa.repository

import com.example.roomsiswa.data.Siswa
import com.example.roomsiswa.data.SiswaDao
import kotlinx.coroutines.flow.Flow

class OfflinerepositoriSIswa (private val siswaDao: SiswaDao): ReporisitoriSiswa{

    override fun getAllSiswaStream(): Flow<List<Siswa>> = siswaDao.getAllSiswa()

    override fun getSiswaStream(id: Int): Flow<Siswa?> = siswaDao.getSiswa(id)

    override suspend fun insertSiswa(siswa: Siswa) = siswaDao.insert(siswa)

    override suspend fun deleteSiswa(siswa: Siswa) = siswaDao.delete(siswa)

    override suspend fun updateSiswa(siswa: Siswa) = siswaDao.update(siswa)

}