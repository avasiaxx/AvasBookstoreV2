package com.example.storeapp.data.models


data class Order(
    val id: Int? = null,
    val cart: Cart,
    val orderDate: String,
    val subTotal: Double,
    val taxAmount: Double,
    val total: Double
)
