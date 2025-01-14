package com.example.swvlmovies.core.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.swvlmovies.modules.common.data.local.serialization_adapters.GenreListTypeConverter
import com.example.swvlmovies.modules.common.data.local.MoviesDAO
import com.example.swvlmovies.modules.common.data.local.models.MovieDTO
import com.example.swvlmovies.modules.common.data.local.serialization_adapters.ActorListTypeConverter
import com.example.swvlmovies.modules.movies.features.details.data.source.local.PhotosDAO
import com.example.swvlmovies.modules.movies.features.details.data.source.model.PhotosDTO

@Database(entities = [MovieDTO::class, PhotosDTO::class], version = 1,exportSchema = false)
@TypeConverters(
    ActorListTypeConverter::class,
    GenreListTypeConverter::class)
abstract class SwvlMoviesDB : RoomDatabase() {
    abstract fun moviesDao(): MoviesDAO
    abstract fun photosDao(): PhotosDAO
}
const val MOVIE_TABLE="movie"
const val PHOTOS_TABLE="movie_photos"
const val GENRE_TABLE="genre"
const val ACTOR_TABLE="actor"