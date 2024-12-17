package dev.manuelernesto.nearby.ui.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import dev.manuelernesto.nearby.R

@Composable
fun NearbyButton(
    modifier: Modifier = Modifier,
    text: String? = null,
    @DrawableRes iconRes: Int? = null,
    onClick: () -> Unit
) {

    Button(modifier = modifier, onClick = onClick) {
        iconRes?.let {
            Icon(painter = painterResource(id = iconRes), contentDescription = "Button Icon")
        }
        text?.let { Text(text = text) }
    }

}


@Preview
@Composable
private fun NearbyButtonPreview() {
    NearbyButton(
        modifier = Modifier.fillMaxWidth(),
        text = "Confirm",
        iconRes = R.drawable.ic_scan
    ) {

    }
}