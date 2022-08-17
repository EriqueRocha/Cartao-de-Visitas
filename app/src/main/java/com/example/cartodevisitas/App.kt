package com.example.cartodevisitas

import android.app.Application
import com.example.cartodevisitas.data.AppDatabase
import com.example.cartodevisitas.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) } // quando o app iniciar ele irá instanciar o Room
    val repository by lazy { BusinessCardRepository(database.businessDao()) }  // quando o app iniciar ele irá instanciar o repository
}