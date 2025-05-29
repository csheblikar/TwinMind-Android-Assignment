package com.csheblikar.twinmind_assignment.domain

import com.csheblikar.twinmind_assignment.data.AuthRepository
import com.google.firebase.auth.AuthCredential

class AuthUseCase(private val repo: AuthRepository) {
    suspend fun signIn(credential: AuthCredential) = repo.signInWithGoogle(credential)
    fun currentUser() = repo.getCurrentUser()
}