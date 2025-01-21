package com.example.androidmvvmnative.data.repository.dataSource

import com.example.androidmvvmnative.data.model.APIResponse
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getTopHeadlines(): Response<APIResponse>
}