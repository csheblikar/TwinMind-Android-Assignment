package com.csheblikar.twinmind_assignment.presentation.auth

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.csheblikar.twinmind_assignment.domain.AuthUseCase
import com.google.firebase.auth.AuthCredential
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class AuthViewModel(private val useCase: AuthUseCase) : ViewModel() {
    private val _isSignedIn = MutableStateFlow(false)
    val isSignedIn: StateFlow<Boolean> = _isSignedIn

    fun signInWithCredential(credential: AuthCredential) {
        viewModelScope.launch {
            val success = useCase.signIn(credential)
            _isSignedIn.value = success
        }
    }
}