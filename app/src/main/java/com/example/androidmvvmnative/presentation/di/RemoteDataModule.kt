package com.example.androidmvvmnative.presentation.di

import com.example.androidmvvmnative.data.api.NewsAPIService
import com.example.androidmvvmnative.data.repository.dataSource.NewsRemoteDataSource
import com.example.androidmvvmnative.data.repository.dataSourceImpl.NewsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideNewsRemoteDataSource(
        newsAPIService: NewsAPIService
    ): NewsRemoteDataSource {
        return NewsRemoteDataSourceImpl(newsAPIService)
    }
}