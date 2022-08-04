package com.example.repositoriesgit.data.repositories

import com.example.repositoriesgit.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String) : Flow<List<Repo>>

}