package com.example.alkewalletmvvm.feature.data.local

import com.example.alkewalletmvvm.feature.data.model.Transaction

class TransactionDataSet {
    fun creatTransactionsForUser():MutableList<Transaction>{
        return mutableListOf(
            Transaction("id1",2000.0,"id1","id2"),
            Transaction("id2",1000.0,"id1","id3"),
            Transaction("id3",2300.0,"id1","id4"),
            Transaction("id4",1500.0,"id4","id1"),
            Transaction("id5",2100.0,"id3","id4"),
            Transaction("id6",5000.0,"id4","id2"),
        )
    }




}