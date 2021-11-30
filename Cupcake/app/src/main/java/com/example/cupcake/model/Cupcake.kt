package com.example.cupcake.model

import androidx.annotation.DrawableRes

data class Cupcake(
    @DrawableRes val imageResourceID : Int ,
    val name  : String ,
    val about : String ,
    val price : Int

)