package com.klotin.lf.primeiro_klotin.domain

/*Não temos o tipo de acesso definido: public, private ... pois está implicito, por padrão todas as propriedades são private
Note que como nosso construtor não tem nenhuma anotação e nem mesmo a definição explícita de um modificador de acesso,
nós  podemos seguramente remover a palavra constructor, pois neste caso ela é opcional*/

class PalindromoK constructor(conteudo:String){

    //podiamos usar var ou val. No var já temos o get e set implicito.
    // No val não tem o set e colocamos o get só para o customizar
    val conteudo:String=conteudo

        get() { //não precisamos colocar o tipo de retorno do get, pelo tipo da variável já se sabe
            return field.toLowerCase(); //field nos dá acesso a palavra referente ao get
        }

    fun ehPalindromo() : Boolean {
        return conteudo == conteudo.reversed(); //Esse == é o mesmo que o equals, pois no nosso caso a comparação é entre String
    }
}