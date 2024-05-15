package com.example.alkewalletmvvm.feature.domain

import com.example.alkewalletmvvm.feature.data.local.TransactionDataSet
import com.example.alkewalletmvvm.feature.data.model.Transaction

class TransactionUseCase {
    val transactionDataSet = TransactionDataSet()

    fun getAllTransactionForUser(userId:String):MutableList<Transaction>{
        return transactionDataSet.creatTransactionsForUser()
    }


}