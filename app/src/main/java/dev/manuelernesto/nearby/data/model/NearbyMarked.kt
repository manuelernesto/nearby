package dev.manuelernesto.nearby.data.model

data class NearbyMarked(
    val id: String,
    val categoryId: String,
    val name: String,
    val description: String,
    val coupons: Int,
    val rules: List<NearbyRule> = emptyList(),
    val latitude: Double,
    val longitude: Double,
    val address: String,
    val phone: String,
    val cover: String
)