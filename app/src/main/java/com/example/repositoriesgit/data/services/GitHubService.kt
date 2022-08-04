package com.example.repositoriesgit.data.services

import com.example.repositoriesgit.data.model.Repo

import retrofit2.http.GET
import retrofit2.http.Path


interface GitHubService {
    @GET("users/{user}/repos")
    suspend fun listRepositories(@Path("user") user: String?): List<Repo>
}