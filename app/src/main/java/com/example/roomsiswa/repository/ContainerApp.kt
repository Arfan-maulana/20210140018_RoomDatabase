package com.example.roomsiswa.repository

import android.content.Context
import com.example.roomsiswa.data.DatabaseSiswa

interface ContainerApp {
    val reporisitoriSiswa : ReporisitoriSiswa
}

class ContainerDataApp(private val  context: Context): ContainerApp{
    override val reporisitoriSiswa: ReporisitoriSiswa by lazy {
        OfflinerepositoriSIswa(DatabaseSiswa.getDataBase(context).siswaDao())
    }

}