package com.example.androidmvvmnative.presentation.di

import com.example.androidmvvmnative.data.db.ArticleDAO
import com.example.androidmvvmnative.data.repository.dataSource.NewsLocalDataSource
import com.example.androidmvvmnative.data.repository.dataSourceImpl.NewsLocalDataSourceImpl

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {
    @Singleton
    @Provides
    fun provideLocalDataSource(articleDAO: ArticleDAO): NewsLocalDataSource {
        return NewsLocalDataSourceImpl(articleDAO)
    }
}
