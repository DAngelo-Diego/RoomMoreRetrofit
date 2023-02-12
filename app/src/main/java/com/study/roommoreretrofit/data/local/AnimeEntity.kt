package com.study.roommoreretrofit.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.study.roommoreretrofit.domain.util.Constants.ANIME_TABLE

@Entity(tableName = ANIME_TABLE)
data class AnimeEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name= "image") val image: String
)
