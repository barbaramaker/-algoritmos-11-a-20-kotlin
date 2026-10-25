// Código original em Portugol
// prog funcoes
//   string c,cl,d,dl;
//   imprima "\ndigite palavra 1:  ";
//   leia c;
//   imprima "\ndigite palavra 2:  ";
//   leia cl;
//   imprima "\n",strtam(c);
//   imprima "\nconcatenando: ",strconcat(c,cl);
//   d <- strcopia(c);
//   imprima "\nE O CONTEUDO DE D: ",d;
//   dl <- strconcat(c,cl);
//   imprima "\nconcatenacao: ",dl;
//   imprima "\nprimeiro caractere: ",strprim(c);
//   imprima "\nultimo caractere: ",strult(c);
//   imprima "\ntodos menos o primeiro: ",strresto(c);
//   imprima "\no terceiro elemento: ",strelem(c,3);
//   imprima "\nos tres primeiros elementos: ",strnprim(c,3);
//   imprima "\nos tres ultimos elementos: ",strnresto(c,3);
//   imprima "\n";
// fimprog

// Código em Kotlin

fun main() {
    print("\nDigite palavra 1: ")
    val c = readln()

    print("\nDigite palavra 2: ")
    val c1 = readln()

    println("\n${c.length}")
    println("\nConcatenando: ${c + c1}")
    val d = c

    println("\nE O CONTEUDO DE D: $d")
    val d1 = c + c1

    println("\nConcatenacao: $d1")

    println("\nPrimeiro caractere: ${c.firstOrNull() ?: ""}")
    println("\nUltimo caractere: ${c.lastOrNull() ?: ""}")
    println("\nTodos menos o primeiro: ${c.drop(1)}")
    println("\nO terceiro elemento: ${c.getOrNull(3) ?: ""}")
    println("\nOs tres primeiros elementos: ${c.take(3)}")
    println("\nOs tres ultimos elementos: ${c.takeLast(3)}")

    println()
}
