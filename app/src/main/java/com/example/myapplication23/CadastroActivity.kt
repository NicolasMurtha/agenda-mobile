package com.example.myapplication23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cadastro.*

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
    }

    fun salvarPessoa (){

        val p = Pessoa(edtNome.text.toString(), edtFone.text.toString(), edtId.text.toString().toInt())
        PessoaDB.getInstance(this)!!.pessoaDao().salvar(p)

        Toast.makeText(this, "CONTATO SALVO!", Toast.LENGTH_LONG)

        finish()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_cadastro, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(item.itemId == R.id.menuCancelar)
            finish()
        else if (item.itemId == R.id.menuSalvar)
            salvarPessoa()

        return super.onOptionsItemSelected(item)
    }

}