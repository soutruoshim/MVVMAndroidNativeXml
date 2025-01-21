package com.example.androidmvvmnative.domain.usecase

import com.example.androidmvvmnative.data.model.Article
import com.example.androidmvvmnative.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article)=newsRepository.deleteNews(article)
}