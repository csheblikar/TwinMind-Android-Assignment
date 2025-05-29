package com.csheblikar.twinmind_assignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.csheblikar.twinmind_assignment.data.AuthRepository
import com.csheblikar.twinmind_assignment.domain.AuthUseCase
import com.csheblikar.twinmind_assignment.presentation.auth.AuthViewModel
import com.csheblikar.twinmind_assignment.presentation.auth.SignInScreen
import com.csheblikar.twinmind_assignment.ui.theme.TwinMind_AssignmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val viewModel = remember { AuthViewModel(AuthUseCase(AuthRepository())) }
            SignInScreen(viewModel)
        }
    }
}