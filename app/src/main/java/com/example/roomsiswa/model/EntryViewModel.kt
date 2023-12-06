package com.example.roomsiswa.model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.roomsiswa.repository.ReporisitoriSiswa


class EntryViewModel (private val repositoriSiswa: ReporisitoriSiswa): ViewModel() {

    /**
     * Berisi Status Siswa Saat Ini
     */
    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set

    /**
     * Function Untuk valiasi input
     */
    private fun validasiInput (uiState:DetailSiswa = uiStateSiswa.detailSiswa):Boolean{
        return  with(uiState){
            nama.isNotBlank()&&alamat.isNotBlank()&&telepon.isNotBlank()
        }
    }
    /**
     * Mewakili Status Untuk Siswa
     */
    data class UIStateSiswa(
        val detailSiswa: DetailSiswa = DetailSiswa(),
        val isEntryValid: Boolean = false
    )

    data class DetailSiswa(
        val id: Int = 0,
        val nama: String = "",
        val alamat: String = "",
        val telepon: String = "",
    )
}