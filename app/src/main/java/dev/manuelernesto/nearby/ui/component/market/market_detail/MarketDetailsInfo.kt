package dev.manuelernesto.nearby.ui.component.market.market_detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.manuelernesto.nearby.R
import dev.manuelernesto.nearby.data.model.Market
import dev.manuelernesto.nearby.data.model.mock.mockMarket
import dev.manuelernesto.nearby.ui.theme.Gray400
import dev.manuelernesto.nearby.ui.theme.Gray500
import dev.manuelernesto.nearby.ui.theme.Typography

@Composable
fun MarketDetailsInfo(
    modifier: Modifier = Modifier,
    market: Market
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(text = "Informations", style = Typography.headlineSmall, color = Gray400)

        Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            Icon(
                modifier = Modifier.size(16.dp),
                painter = painterResource(R.drawable.ic_ticket),
                tint = Gray500,
                contentDescription = "Icon Cupon"
            )
            Text(
                text = "${market.coupons} Coupons available",
                style = Typography.labelMedium,
                color = Gray500
            )
        }

        Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            Icon(
                modifier = Modifier.size(16.dp),
                painter = painterResource(R.drawable.ic_map_pin),
                tint = Gray500,
                contentDescription = "Icon Adress"
            )
            Text(
                text = market.address,
                style = Typography.labelMedium,
                color = Gray500
            )
        }

        Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            Icon(
                modifier = Modifier.size(16.dp),
                painter = painterResource(R.drawable.ic_phone),
                tint = Gray500,
                contentDescription = "Icon Phone"
            )
            Text(
                text = market.phone,
                style = Typography.labelMedium,
                color = Gray500
            )
        }
    }
}


@Preview
@Composable
private fun MarketDetailsInfoPrev() {
    MarketDetailsInfo(
        market = mockMarket
    )
}