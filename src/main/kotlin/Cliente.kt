data class Cliente(
    var nome: String,
    var sobremenome: String,
) {
    var produtoComprado = ""

    constructor(
        nome: String, sobrenome: String, produtoComprado: String
    ) : this(nome, sobrenome) {
        this.produtoComprado = produtoComprado
    }
    fun produtoComprado(produto:String){
        println("Produto comprado: ")
        print("$produto")
    }

}