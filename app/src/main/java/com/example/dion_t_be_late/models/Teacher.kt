package com.example.dion_t_be_late.models

import com.google.gson.annotations.SerializedName
import java.sql.Date
import java.sql.Time

data class Teacher(
    @SerializedName("date")
    val date: Date,

    @SerializedName("h_debut")
    val hdebut: Time,

    @SerializedName("h_fin")
    val hfin: Time,

    @SerializedName("name")
    val name: String,

    @SerializedName("filiere")
    val filiere: Filiere,

    @SerializedName("annee")
    val annee: Annee,

    @SerializedName("groupe")
    val groupe: GroupeTP,

    @SerializedName("appel")
    val appel: Boolean
)
