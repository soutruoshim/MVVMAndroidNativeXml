package com.example.androidmvvmnative.domain.usecase

import com.example.androidmvvmnative.data.model.APIResponse
import com.example.androidmvvmnative.data.util.Resource
import com.example.androidmvvmnative.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(country:String,searchQuery:String,page:Int): Resource<APIResponse>{
        return newsRepository.getSearchedNews(country,searchQuery,page)
    }
}