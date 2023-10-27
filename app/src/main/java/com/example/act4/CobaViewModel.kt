package com.example.act4

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel : ViewModel(){
    var namaUsr: String by mutableStateOf("")
        private set
    var noTelp: String by mutableStateOf("")
        private set
    var jenisKL: String by mutableStateOf("")
        private set
    var emailUsr: String by mutableStateOf("")
        private set
    var alamat: String by mutableStateOf("")
        private set
    var status: String by mutableStateOf("")
        private set

    private val _uiState = MutableStateFlow(DataForm())
    val uiState: StateFlow<DataForm> = _uiState.asStateFlow()

    fun insertData(nm: String, tlp: String, jk: String, amt: String, al: String, st: String){
        namaUsr = nm;
        noTelp = tlp;
        jenisKL = jk;
        emailUsr= amt;
        alamat = al;
        status =  st;
    }

    fun setjenisK(pilihJK: String){
        _uiState.update { currentState -> currentState.copy(sex = pilihJK) }
    }
    fun setStatus(pilihst: String){
        _uiState.update { currentState -> currentState.copy(status = pilihst) }
    }
}