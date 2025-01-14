package com.example.swvlmovies.core.di.modules
import com.example.swvlmovies.modules.movies.features.details.di.MovieDetailsFragmentBuilder
import com.example.swvlmovies.modules.movies.features.details.presentation.MovieDetailsFragment
import com.example.swvlmovies.modules.movies.presentation.MoviesActivity
import com.example.swvlmovies.modules.movies.features.search.di.MoviesSearchFragmentBuilder
import com.example.swvlmovies.modules.splash.di.SplashModule
import com.example.swvlmovies.modules.splash.presentation.SplashActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {
    @ActivityScope
    @ContributesAndroidInjector(modules = [SplashModule::class])
    internal abstract fun contributeSplashActivity(): SplashActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [MoviesSearchFragmentBuilder::class,MovieDetailsFragmentBuilder::class])
    internal abstract fun contributeMoviesActivity(): MoviesActivity

}

