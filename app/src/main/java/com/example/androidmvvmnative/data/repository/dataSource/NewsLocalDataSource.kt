package com.example.androidmvvmnative.data.repository.dataSource

import com.example.androidmvvmnative.data.model.Article

interface NewsLocalDataSource {
    suspend fun saveArticleToDB(article: Article)
}