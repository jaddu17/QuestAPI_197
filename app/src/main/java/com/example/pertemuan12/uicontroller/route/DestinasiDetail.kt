package com.example.pertemuan12.uicontroller.route

import com.example.pertemuan12.R

object DestinasiDetail {
    val route = "item_detail"
    val titleRes = R.string.detail_siswa
    const val itemIdArg = "itemId"
    val routeWithArgs = "$route/{$itemIdArg}"
}