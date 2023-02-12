package com.study.roommoreretrofit.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [AnimeEntity::class], version = 1)
abstract class AnimeDataBase: RoomDatabase() {
    abstract fun animeDao(): AnimeDao
}