package com.example.alkewalletmvvm.feature.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.alkewalletmvvm.feature.data.model.Transaction
import com.example.alkewalletmvvm.feature.domain.TransactionUseCase

class TransactionViewModel: ViewModel() {

    private val listDataTransaction  = MutableLiveData<MutableList<Transaction>>()
    val transactionUseCase = TransactionUseCase()

    init {
        getTransactionList("id1")
    }


    fun setListTransactionData(listTransaction: MutableList<Transaction>){
        listDataTransaction.value = listTransaction
    }

    fun getTransactionList(userId:String){
        setListTransactionData(transactionUseCase.getAllTransactionForUser(userId))
    }

    fun getLiveDataObserver():LiveData<MutableList<Transaction>>{
        return listDataTransaction
    }
}