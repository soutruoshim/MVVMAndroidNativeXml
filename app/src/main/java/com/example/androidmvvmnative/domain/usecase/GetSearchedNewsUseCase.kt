package com.example.androidmvvmnative.domain.usecase

import com.example.androidmvvmnative.data.model.APIResponse
import com.example.androidmvvmnative.data.util.Resource
import com.example.androidmvvmnative.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(searchQuery:String): Resource<APIResponse> {
        return newsRepository.getSearchedNews(searchQuery)
    }
}