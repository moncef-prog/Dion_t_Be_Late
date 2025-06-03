package com.example.dion_t_be_late.models

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("firstname")
    val firstname: String,

    @SerializedName("lastname")
    val lastname: String,

    @SerializedName("username")
    val username: String,

    @SerializedName("password")
    val password: String,

    @SerializedName("role")
    val role: Role,

    @SerializedName("annee")
    val annee: Annee?,

    @SerializedName("filiere")
    val filiere: Filiere?,

    @SerializedName("groupeTD")
    val groupeTD: GroupeTD?,

    @SerializedName("groupeTP")
    val groupeTP: GroupeTP?,

    @SerializedName("firstLogin")
    val premiereConnexion: Boolean
)