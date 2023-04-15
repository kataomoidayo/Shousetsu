package com.shiken.shousetsu.dataclass

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class LightNovel (
    var judul : String ?= "",
    var keterangan : String ?= "",
    var sampul: Int ?= 0,
    var namapenulisilustrator : String ?= "",
    var terbit : String?= "",
    var penerbit : String?= "",
    var genre : String?= "",
    var volume : String?= "",
    var deskripsi : String?= "",
    var plot : String? ="",
    var selengkapnya : String? = "",
    var tokoresmi : String? =""

) : Parcelable
