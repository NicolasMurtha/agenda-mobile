package com.example.myapplication23

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
class Pessoa(
    val nome: String,
    val fone: String,
    @PrimaryKey
    val id: Int
) {
    override fun toString(): String {
        return nome + " - " + fone
    }

}