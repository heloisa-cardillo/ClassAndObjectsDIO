package dioBank

data class Banco(
    val nome: String,
    val numero: Int
)

fun main(){
    val dioBanco = Banco("DIO", 12)
    //se eu disse para quem estou atribuindo (escrever nome e numero em vez de autocompletar), pode alterar a ordem. Caso contrario nao
    //numero: 12, nome:"DIO"
    println(dioBanco.nome)
    println(dioBanco.numero)

    val dioBanco2 =dioBanco.copy("DIO2",12)
    println(dioBanco2.nome)
    println(dioBanco2.numero)
    //copy= copia o objeto/funcao mas podendo alterar as informacoes
    //Cria-se uma funcao e apenas replica ela de maneira a ser possivel preencher com outros dados
}