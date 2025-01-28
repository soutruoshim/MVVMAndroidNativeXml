package com.example.androidmvvmnative.data.repository.dataSourceImpl

import com.example.androidmvvmnative.data.db.ArticleDAO
import com.example.androidmvvmnative.data.model.Article
import com.example.androidmvvmnative.data.repository.dataSource.NewsLocalDataSource

class NewsLocalDataSourceImpl(
    private val articleDAO: ArticleDAO
) : NewsLocalDataSource {
    override suspend fun saveArticleToDB(article: Article) {
        articleDAO.insert(article)
    }
}