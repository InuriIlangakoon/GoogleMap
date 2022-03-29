package com.example.googlemap.models

import java.io.Serializable

data class UserMap (val title: String, val description: String, val latitude: Double, val longitude: Double) : Serializable