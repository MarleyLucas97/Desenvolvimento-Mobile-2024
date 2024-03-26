import java.util.Scanner
fun main() {
    println("Digite o nome do aluno: ")
    var nome = readln()
    val x = mutableListOf<Double>()
    for(i in 1..3) {
        println("Digite a $i nota: ")
        val y = readln().toDouble()
        x.add(y)
    }
    var m = (x[0] + x[1] +x[2]) / 3
            println("a media das notas e: $m")
    if (m >=7){
        println("O Aluno $nome foi Aprovado!!!")
    }else if(m < 7){
        println("O Aluno $nome foi Reprovado.")
    }else{
        println("Notas invalidas!")
    }
}
