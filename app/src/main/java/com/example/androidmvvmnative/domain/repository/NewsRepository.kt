package com.example.androidmvvmnative.domain.repository

import com.example.androidmvvmnative.data.model.APIResponse
import com.example.androidmvvmnative.data.model.Article
import com.example.androidmvvmnative.data.util.Resource
import kotlinx.coroutines.flow.Flow

interface NewsRepository {
    suspend fun getNewsHeadlines(): Resource<APIResponse>
    suspend fun getSearchedNews(searchQuery:String) : Resource<APIResponse>
    suspend fun saveNews(article: Article)
    suspend fun deleteNews(article: Article)
    fun getSavedNews(): Flow<List<Article>>
}