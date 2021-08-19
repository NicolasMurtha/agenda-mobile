package com.example.myapplication23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cadastro.*

class DeletarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val id = intent.getIntExtra("id", 0)

        PessoaDB.getInstance(this)!!.pessoaDao().deletar(id)

        Toast.makeText(this, "Contato deletado com sucesso", Toast.LENGTH_SHORT).show()

    }
}