package com.example.roomsiswa.model

import androidx.lifecycle.ViewModel
import com.example.roomsiswa.repository.ReporisitoriSiswa


class EntryViewModel (private val repositoriSiswa: ReporisitoriSiswa): ViewModel(){

    data class DetailSiswa (
        val id : Int = 0,
        val nama : String = "",
        val alamat : String = "",
        val telepon : String = "",
    )
}