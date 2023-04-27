package dioBank

class Pessoa {
    var nome: String = "Maria"
    var cpf: String = "123456789-12"
        private set
    //set = funcao que atribui valor a propriedade
    //usa private set para fazer um atributo privado/ alterar a visibilidade
    //modificadores de visibilidade influenciam no geral em propriedades var

    constructor()

    fun uneNomeCpf() = "$nome e $cpf"
//interpolacao = juntar as variaveis em uma ->
    //println(maria.nome)    println(maria.cpf) -> println(maria.uneNomeCpf)
    inner class Endereco {
        var rua: String = "Rua teste"
    }
// Classe interna = 1 nome da classe e depois o atributo
}

fun main(){
    val maria = Pessoa()

    println(maria.uneNomeCpf())

    println(maria.Endereco().rua)
}

