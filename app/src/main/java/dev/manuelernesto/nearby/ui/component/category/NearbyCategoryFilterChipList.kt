package dev.manuelernesto.nearby.ui.component.category

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.manuelernesto.nearby.data.model.Category

@Composable
fun NearbyCategoryFilterChipList(
    modifier: Modifier = Modifier,
    categories: List<Category>,
    onSelectedCategoryChanged: (Category) -> Unit
) {
    var selectedCategoryId by remember { mutableStateOf(categories.firstOrNull()?.id.orEmpty()) }

    LaunchedEffect(key1 = selectedCategoryId) {
        val selectedCategoryOrNull = categories.find { it.id == selectedCategoryId }
        selectedCategoryOrNull?.let { onSelectedCategoryChanged(it) }
    }

    LazyRow(
        modifier = modifier,
        contentPadding = PaddingValues(horizontal = 24.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(items = categories, key = { it.id }) { nearbyCategory ->
            NearbyCategoryFilterChip(
                category = nearbyCategory,
                isSelected = nearbyCategory.id == selectedCategoryId,
                onClick = { isSelected ->
                    if (isSelected) {
                        selectedCategoryId = nearbyCategory.id
                    }
                })
        }

    }
}

@Preview
@Composable
private fun NearbyCategoryFilterChipListPreview() {

    NearbyCategoryFilterChipList(
        categories = listOf(
            Category("1", "Food"),
            Category("2", "Shopping"),
            Category("3", "Accommodation"),
            Category("4", "Supermarket"),
            Category("5", "Entertainment"),
            Category("6", "Pharmacy"),
            Category("7", "Fuel"),
            Category("8", "Bakery")
        ),
        onSelectedCategoryChanged = {}
    )

}