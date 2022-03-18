package com.plcoding.pokedex.data.response

data class Move(
    val move: MoveX,
    val version_group_details: List<VersionGroupDetail>
)