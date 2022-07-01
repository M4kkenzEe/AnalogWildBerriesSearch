package com.example.nirs.Model

data class Product(
    val brand: String,
    val brandId: Int,
    val colors: List<Color>,
    val diffPrice: Boolean,
    val feedbacks: Int,
    val id: Int,
    val isNew: Boolean,
    val kindId: Int,
    val name: String,
    val panelPromoId: Int,
    val pics: Int,
    val priceU: Int,
    val promoTextCat: String,
    val rating: Int,
    val root: Int,
    val sale: Int,
    val salePriceU: Int,
    val siteBrandId: Int,
    val sizes: List<Size>,
    val subjectId: Int,
    val subjectParentId: Int,
    val time1: Int,
    val time2: Int
)