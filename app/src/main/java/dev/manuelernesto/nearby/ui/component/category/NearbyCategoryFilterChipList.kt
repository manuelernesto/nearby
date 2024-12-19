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
import dev.manuelernesto.nearby.data.model.NearbyCategory

@Composable
fun NearbyCategoryFilterChipList(
    modifier: Modifier = Modifier,
    categories: List<NearbyCategory>,
    onSelectedCategoryChanged: (NearbyCategory) -> Unit
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
            NearbyCategory("1", "Food"),
            NearbyCategory("2", "Shopping"),
            NearbyCategory("3", "Accommodation"),
            NearbyCategory("4", "Supermarket"),
            NearbyCategory("5", "Entertainment"),
            NearbyCategory("6", "Pharmacy"),
            NearbyCategory("7", "Fuel"),
            NearbyCategory("8", "Bakery")
        ),
        onSelectedCategoryChanged = {}
    )

}