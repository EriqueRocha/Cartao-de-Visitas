package com.example.cartodevisitas.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.example.cartodevisitas.App
import com.example.cartodevisitas.R
import com.example.cartodevisitas.data.BusinessCard
import com.example.cartodevisitas.databinding.ActivityAddCartaoBinding

class AddCartao : AppCompatActivity() {

    private val binding by lazy { ActivityAddCartaoBinding.inflate(layoutInflater) }

    private val mainViewModel: MainViewModel by viewModels {
        MainViewModelFactory((application as App).repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListener()
    }

    private fun insertListener(){
        binding.btnClose.setOnClickListener {
            finish()
        }
        binding.btnConfirm.setOnClickListener {
            val businessCard = BusinessCard(
                name = binding.tilNome.editText?.text.toString(),
                conpany = binding.tilEmpresa.editText?.text.toString(),
                phone = binding.tilTelefone.editText?.text.toString(),
                email = binding.tilEmail.editText?.text.toString(),
                backgroundColor = binding.tilColor.editText?.text.toString()
                )
                mainViewModel.insert(businessCard)
                Toast.makeText(this, R.string.success, Toast.LENGTH_SHORT).show()
                finish()
            }
        binding.btnClose.setOnClickListener {
            finish()
          }
         }
        }
