package dev.manuelernesto.nearby.data.model

import androidx.annotation.DrawableRes
import dev.manuelernesto.nearby.R
import dev.manuelernesto.nearby.data.model.CategoryFilterChipView.entries

enum class CategoryFilterChipView(
    val description: String,
    @DrawableRes val icon: Int
) {
    FOOD("Food", R.drawable.ic_tools_kitchen_2),
    SHOPPING("Shopping", R.drawable.ic_shopping_bag),
    ACCOMMODATION("Accommodation", R.drawable.ic_bed),
    SUPERMARKET("Supermarket", R.drawable.ic_shopping_cart),
    ENTERTAINMENT("Entertainment", R.drawable.ic_movie),
    PHARMACY("Pharmacy", R.drawable.ic_first_aid_kit),
    FUEL("Fuel", R.drawable.ic_gas_station),
    BAKERY("Bakery", R.drawable.ic_bakery);

    companion object {
        fun fromDescription(description: String): CategoryFilterChipView? {
            return entries.find { it.description == description }
        }
    }
}