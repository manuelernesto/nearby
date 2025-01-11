package dev.manuelernesto.nearby.data.model.mock

import dev.manuelernesto.nearby.data.model.Market

val mockMarkets = listOf(
    Market(
        id = "1",
        categoryId = "1",
        name = "Market One",
        description = "Description for Market One",
        address = "Address for Market One",
        coupons = 3,
        latitude = 37.7749,
        longitude = -122.4194,
        cover = "https://via.placeholder.com/150",
        phone = "123-456-7890"
    ),
    Market(
        id = "2",
        categoryId = "2",
        name = "Market Two",
        description = "Description for Market Two",
        address = "Address for Market Two",
        coupons = 5,
        latitude = 37.7749,
        longitude = -122.4194,
        cover = "https://via.placeholder.com/150",
        phone = "123-456-7891"
    ),
    Market(
        id = "3",
        categoryId = "3",
        name = "Market Three",
        description = "Description for Market Three",
        address = "Address for Market Three",
        coupons = 2,
        latitude = 37.7749,
        longitude = -122.4194,
        cover = "https://via.placeholder.com/150",
        phone = "123-456-7892"
    ),
    Market(
        id = "4",
        categoryId = "4",
        name = "Market Four",
        description = "Description for Market Four",
        address = "Address for Market Four",
        coupons = 0,
        latitude = 37.7749,
        longitude = -122.4194,
        cover = "https://via.placeholder.com/150",
        phone = "123-456-7893"
    ),
    Market(
        id = "5",
        categoryId = "5",
        name = "Market Five",
        description = "Description for Market Five",
        address = "Address for Market Five",
        coupons = 1,
        latitude = 37.7749,
        longitude = -122.4194,
        cover = "https://via.placeholder.com/150",
        phone = "123-456-7894"
    )

)
val mockMarket = Market(
    id = "1",
    categoryId = "1",
    name = "Mock Market",
    description = "This is a mock description for the market. It provides a brief overview of what the market offers.",
    address = "123 Mock Street, Mock City",
    coupons = 5,
    latitude = 37.7749,
    longitude = -122.4194,
    cover = "https://via.placeholder.com/150",
    phone = "123-456-7890"
)