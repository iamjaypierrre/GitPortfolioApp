package com.example.repositoriesgit.data.repositories

import android.os.RemoteException
import com.example.repositoriesgit.data.services.GitHubService
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException

class RepoRepositoryImpl(private val service: GitHubService) : RepoRepository {

    override suspend fun listRepositories(user: String) = flow {
        try {
            val repoList = service.listRepositories(user)
            emit(repoList)
        }catch (ex: HttpException) {
            throw com.example.repositoriesgit.core.RemoteException(ex.message ?: "Nao Foi Possivel Fazer a Busca no Momento")
        }

    }
}