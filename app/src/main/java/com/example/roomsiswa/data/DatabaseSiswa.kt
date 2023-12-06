package com.example.roomsiswa.data

import android.content.Context
import android.provider.CalendarContract.Instances
import androidx.room.Room
import androidx.room.RoomDatabase
import java.security.AccessControlContext

abstract class DatabaseSiswa : RoomDatabase(){
    abstract fun siswaDao() : SiswaDao

    companion object{
        @Volatile
        private var Instance: DatabaseSiswa? = null

        fun getDataBase(context: Context): DatabaseSiswa{
            return (Instance?: synchronized(this){
                Room.databaseBuilder(context,DatabaseSiswa::class.java,name = "siswa_database")
                    .build().also { Instance= it }
            })
        }
    }
}