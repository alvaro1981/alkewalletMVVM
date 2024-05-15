package com.example.alkewalletmvvm.feature.presentation.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.alkewalletmvvm.R
import com.example.alkewalletmvvm.databinding.ActivityMainBinding
import com.example.alkewalletmvvm.feature.data.model.Transaction
import com.example.alkewalletmvvm.feature.presentation.viewmodel.TransactionViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var  viewModel : TransactionViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupViewModel()
        binding.button.setOnClickListener {
            viewModel.getTransactionList("id1")
        }


    }

    private fun setupViewModel(){
        viewModel = ViewModelProvider(this).get(TransactionViewModel::class.java)
        val transactionObserver = Observer<MutableList<Transaction>>{
            Log.i("transacciones",it.toString())
        }
        viewModel.getLiveDataObserver().observe(this, transactionObserver)
    }
}