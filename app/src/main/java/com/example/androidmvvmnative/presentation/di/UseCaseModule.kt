package com.example.androidmvvmnative.presentation.di

import com.example.androidmvvmnative.domain.repository.NewsRepository
import com.example.androidmvvmnative.domain.usecase.GetNewsHeadlinesUseCase
import com.example.androidmvvmnative.domain.usecase.GetSavedNewsUseCase
import com.example.androidmvvmnative.domain.usecase.GetSearchedNewsUseCase
import com.example.androidmvvmnative.domain.usecase.SaveNewsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {
    @Singleton
    @Provides
    fun provideGetNewsheadLinesUseCase(
        newsRepository: NewsRepository
    ):GetNewsHeadlinesUseCase{
        return GetNewsHeadlinesUseCase(newsRepository)
    }

    @Singleton
    @Provides
    fun provideGetSearchedNewsUseCase(
        newsRepository: NewsRepository
    ): GetSearchedNewsUseCase {
        return GetSearchedNewsUseCase(newsRepository)
    }

    @Singleton
    @Provides
    fun provideSaveNewsUseCase(
        newsRepository: NewsRepository
    ): SaveNewsUseCase {
        return SaveNewsUseCase(newsRepository)
    }

    @Singleton
    @Provides
    fun provideGetSavedNewsUseCase(
        newsRepository: NewsRepository
    ): GetSavedNewsUseCase {
        return GetSavedNewsUseCase(newsRepository)
    }
}
