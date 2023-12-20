package com.wisnumkt.capstone1.ui.login

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthInvalidUserException
import kotlinx.coroutines.tasks.await

class AuthViewModel : ViewModel() {
    private val firebaseAuth = FirebaseAuth.getInstance()
    private val _isAuthenticated = mutableStateOf(false)
    val isAuthenticated: State<Boolean> get() = _isAuthenticated

    suspend fun login(email: String, password: String, navController: NavController?) {
        try {
            // Menggunakan Firebase untuk otentikasi
            val result = firebaseAuth.signInWithEmailAndPassword(email, password).await()

            // Jika otentikasi berhasil
            _isAuthenticated.value = result.user != null

            if (_isAuthenticated.value) {
                navController?.navigate("home")
            } else {
                // Login gagal
                handleLoginFailure("User tidak ditemukan")
            }
        } catch (e: FirebaseAuthInvalidUserException) {
            // Tangani kesalahan jika user tidak ditemukan
            handleLoginFailure("User tidak ditemukan")
        } catch (e: Exception) {
            // Tangani kesalahan Firebase atau kegagalan login
            handleLoginFailure("Gagal login: ${e.message}")
        }
    }

    private fun handleLoginFailure(errorMessage: String) {
        // Lakukan sesuatu dengan pesan kesalahan, misalnya, tampilkan di antarmuka pengguna
        println(errorMessage)
    }
}
