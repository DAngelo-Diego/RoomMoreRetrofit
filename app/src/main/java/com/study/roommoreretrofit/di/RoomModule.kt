package com.study.roommoreretrofit.di

import android.content.Context
import androidx.room.Room
import com.study.roommoreretrofit.data.local.AnimeDao
import com.study.roommoreretrofit.data.local.AnimeDataBase
import com.study.roommoreretrofit.domain.util.Constants.ANIME_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Singleton
    @Provides
    fun provideAnimeDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        AnimeDataBase::class.java,
        ANIME_DATABASE
    ).build()

    @Singleton
    @Provides
    fun provideAnimeDao(db: AnimeDataBase) = db.animeDao()
}