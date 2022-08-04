package com.example.repositoriesgit.domain

import com.example.repositoriesgit.core.UseCase
import com.example.repositoriesgit.data.model.Repo
import com.example.repositoriesgit.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
    ) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}