package com.example.androidmvvmnative.presentation.di

import com.example.androidmvvmnative.data.repository.NewsRepositoryImpl
import com.example.androidmvvmnative.data.repository.dataSource.NewsLocalDataSource
import com.example.androidmvvmnative.data.repository.dataSource.NewsRemoteDataSource
import com.example.androidmvvmnative.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(
        newsRemoteDataSource: NewsRemoteDataSource,
        newsLocalDataSource: NewsLocalDataSource
    ): NewsRepository {
        return NewsRepositoryImpl(newsRemoteDataSource, newsLocalDataSource)
    }

}