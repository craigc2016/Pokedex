package com.plcoding.pokedex.data.response

data class HeldItem(
    val item: Item,
    val version_details: List<VersionDetail>
)