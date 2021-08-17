package com.example.myapplication23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_cadastro.*

class EditarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        edtId.visibility = View.INVISIBLE

        val id = intent.getIntExtra("id", 0)

        val p = PessoaDB.getInstance(this)!!.pessoaDao().find(id)

        edtNome.setText(p.nome)
        edtFone.setText(p.fone)
        //edtId.setText(p.id)

    }
}