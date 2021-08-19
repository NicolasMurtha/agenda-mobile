package com.example.myapplication23

import androidx.room.*

@Dao
interface PessoaDAO {

    @Insert
    fun salvar(p: Pessoa)

    @Query("DELETE FROM Pessoa WHERE id = :id")
    fun deletar(id: Int)

    @Update
    fun atualizar(p: Pessoa)

    @Query("SELECT * FROM Pessoa WHERE id = :id")
    fun find(id: Int): Pessoa

    @Query("SELECT * FROM Pessoa")
    fun listar(): List<Pessoa>
}