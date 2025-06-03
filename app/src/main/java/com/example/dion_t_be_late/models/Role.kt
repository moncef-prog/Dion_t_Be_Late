package com.example.dion_t_be_late.models

import com.google.gson.annotations.SerializedName

enum class Role {
    @SerializedName("etudiant")
    ETUDIANT,

    @SerializedName("professeur")
    PROFESSEUR,

    @SerializedName("administration")
    ADMINISTRATION
}
