package com.example.myapplication23

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    var lista : List<Pessoa> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnNovo.setOnClickListener{
            startActivity(Intent(this, CadastroActivity::class.java))
        }

        lstPessoa.setOnItemClickListener {parent, view, position, id ->
            val p = lista.get(position)

            val u = Intent(this, EditarActivity::class.java)

            u.putExtra("id", p.id)

            startActivity(u)
        }

        lstPessoa.setOnItemLongClickListener { parent, view, position, id ->
            val p = lista.get(position)

            val i = Intent(this, DeletarActivity::class.java)

            i.putExtra("id", p.id)

            startActivity(i)

            true

        }

    }



    override fun onResume() {
        super.onResume()
        carregarLista()
    }

    fun carregarLista(){

        lista = PessoaDB.getInstance(this)!!.pessoaDao().listar()

        val adp = ArrayAdapter<Pessoa>(this,
        android.R.layout.simple_list_item_1,
            lista)


        lstPessoa.adapter = adp
    }
}


