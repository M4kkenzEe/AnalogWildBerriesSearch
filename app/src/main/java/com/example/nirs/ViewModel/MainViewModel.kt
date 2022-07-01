package com.example.nirs.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nirs.Model.Buffer
import com.example.nirs.Repo.Repository
import kotlinx.coroutines.launch
import retrofit2.Response


class MainViewModel(private val repository: Repository) : ViewModel() {

    val myResponse: MutableLiveData<Response<Buffer>> = MutableLiveData()

    fun getProduct(title: String = "кресло") {

        viewModelScope.launch {
            val response = repository.getProduct(title)
            myResponse.value = response

        }

    }

}