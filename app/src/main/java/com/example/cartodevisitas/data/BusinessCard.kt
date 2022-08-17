package com.example.cartodevisitas.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BusinessCard(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,//autoGenerate = true --> cria os indices de forma automatizada
    val name: String,    // o id será a variável que vai sofrer incremento nos indices forma automatizada
    val conpany: String,
    val phone: String,
    val email: String,
    val backgroundColor: String
)