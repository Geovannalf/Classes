fun main(args: Array<String>) {
    val cliente = Cliente("Geovanna", "Ferreira")
    println("Digite o produto comprado: ")
    var produto = readln()
    cliente.produtoComprado(produto)


}