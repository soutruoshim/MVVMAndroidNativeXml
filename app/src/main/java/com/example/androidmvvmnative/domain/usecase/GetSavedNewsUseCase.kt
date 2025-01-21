package com.example.androidmvvmnative.domain.usecase

import com.example.androidmvvmnative.data.model.Article
import com.example.androidmvvmnative.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {
    fun execute(): Flow<List<Article>> {
        return newsRepository.getSavedNews()
    }
}