package com.klotin.lf.primeiro_klotin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.klotin.lf.primeiro_klotin.domain.PalindromoK
import kotlinx.android.synthetic.main.activity_main.*

/*Em Klotin, toda Interface  tem por padrão os métodos, funções, sendo open, pode ser sobrescritos em subclasses*/

class MainActivityK: AppCompatActivity(), View.OnClickListener{

    //savedInstanceState pode ser  null, por isso o Bundle?
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Lembra do  apply plugin: 'kotlin-android-extensions' adicionado ao Gradle App Level? 
        Devido a ele podemos acessar facilmente um objeto da camada de visualização, sem necessidade do findViewById(),
        apenas utilizando o ID da View */
        bt_verificar.setOnClickListener( this )
    }

    override fun onClick(view: View?) {
        //passo para a variavel do construtor da classe o valor digitado pelo usuario
        //a variavel é do tipo val pois o construtor da classe é assim também
        val palindromo = PalindromoK(et_palindromo.text.toString())
        var resposta:String

        resposta = if(palindromo.ehPalindromo())
            " é um palindromo"
        else
            " NÃO é um palindromo"

        resposta = palindromo.conteudo + resposta
        tv_resposta.text = resposta
    }
}