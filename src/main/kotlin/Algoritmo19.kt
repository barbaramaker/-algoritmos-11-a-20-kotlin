// Código original
// prog teste
//    imprima "raiz: ", raiz(64);
//    imprima "\nraiz com exp e log e realint: ", realint(exp(1/2*log(64)));
//    imprima "\nraiz com exp e log sem realint: ", exp(1/2*log(64));
//    imprima "\n", formatar(sen(45*pi/180)+0.0001,3);
//    imprima "\npotencia com exp e log e formatar: ", formatar(exp(3*log(8))+0.001,3);
//    imprima "\npotencia com exp e log sem formatar: ", exp(3*log(8));
//    imprima "\npotencia com operador** e formatar: ", formatar(8**3,3);
//    imprima "\nraiz cubica: ", exp(1/3*log(8));
//    imprima "\nabsoluto: ", abs(-8);
//    imprima "\nabsoluto: ", abs(8);
//    imprima "\nconvertendo para inteiro 5.5: ", realint(5.5);
//    imprima "\nconvertendo para inteiro 6.5: ", realint(6.5);
//    imprima "\nconvertendo para inteiro 6.5 + 0.0001: ", realint(6.5+0.0001);
//    imprima "\nconvertendo para inteiro 5.45: ", realint(5.45);
//    imprima "\nconvertendo para inteiro 5.51: ", realint(5.51);
//    imprima "\nconvertendo para real 87: ", intreal(87);
//    imprima "\nconvertendo para int 3/4: ", realint(3/4), "\n";
// fimprog

// Código em Kotlin

import kotlin.math.*
import java.util.Locale

fun main() {

    println("raiz: ${sqrt(64.0)}")

    println("raiz com exp e log e realint: ${Math.rint(exp(0.5 * ln(64.0))).toInt()}")

    println("raiz com exp e log sem realint: ${exp(0.5 * ln(64.0))}")

    println("%.3f".format(Locale.US, sin(45.0 * PI / 180) + 0.0001))

    println(

        "potencia com exp e log e formatar: %.2f".format(

            Locale.US,

            exp(3.0 * ln(8.0)) + 0.001

        )

    )

    println("potencia com exp e log sem formatar: ${exp(3.0 * ln(8.0))}")

    println(

        "potencia com operador ** e formatar: %.3f".format(

            Locale.US,

            8.0.pow(3.0)

        )

    )

    println("raiz cubica: ${exp((1.0 / 3.0) * ln(8.0))}")

    println("absoluto: ${abs(-8)}")

    println("absoluto: ${abs(8)}")

    println("convertendo para inteiro 5.5: ${Math.rint(5.5).toInt()}")

    println("convertendo para inteiro 6.5: ${Math.rint(6.5).toInt()}")

    println("convertendo para inteiro 6.5 + 0.0001: ${Math.rint(6.5 + 0.0001).toInt()}")

    println("convertendo para inteiro 5.45: ${Math.rint(5.45).toInt()}")

    println("convertendo para inteiro 5.51: ${Math.rint(5.51).toInt()}")

    println("convertendo para real 87: ${87.toDouble()}")

    println("convertendo para int 3/4: ${Math.rint(3.0 / 4.0).toInt()}")

}