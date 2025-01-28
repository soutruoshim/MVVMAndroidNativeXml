package com.example.androidmvvmnative.presentation.di

import android.app.Application
import com.example.androidmvvmnative.domain.usecase.GetNewsHeadlinesUseCase
import com.example.androidmvvmnative.domain.usecase.GetSavedNewsUseCase
import com.example.androidmvvmnative.domain.usecase.GetSearchedNewsUseCase
import com.example.androidmvvmnative.domain.usecase.SaveNewsUseCase
import com.example.androidmvvmnative.presentation.viewmodel.NewsViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {
    @Singleton
    @Provides
    fun provideNewsViewModelFactory(
        application: Application,
        getNewsHeadlinesUseCase: GetNewsHeadlinesUseCase,
        getSearchedNewsUseCase: GetSearchedNewsUseCase,
        saveNewsUseCase: SaveNewsUseCase,
        getSavedNewsUseCase: GetSavedNewsUseCase
    ): NewsViewModelFactory {
        return NewsViewModelFactory(
            application,
            getNewsHeadlinesUseCase,
            getSearchedNewsUseCase,
            saveNewsUseCase,
            getSavedNewsUseCase
        )
    }
}
