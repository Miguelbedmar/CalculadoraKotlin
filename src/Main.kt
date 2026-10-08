import java.util.Scanner


val sc=  Scanner(System.`in`)

fun main() {
    menu()


}

fun menu(){
    var salir=false
    // PRIMERO CREAMOS LA ESTRUCTURA DEL MENU
    do {
    try {


        println("<=====CALCULADORA========>")
        println("<=======1.SUMAR===========>")
        println("<=======2.RESTAR=========>")
        println("<=======3.MULTIPLICAR====>")
        println("<=======4.DIVIDIR========>")
        println("<=======5.CALCULAR RESTO==>")
        println("<=======6.SALIR==========>")
        if(!sc.hasNextInt()) {
            sc.next()
            println("Error: La opción seleccionada no está disponible")
            continue
        }

        when(val opcion = sc.nextInt()){

            in 1..5->{ // Decimos que desde la opcion 1 hasta la 5  recoga los datos y realice la operación correspondiente
                val(num1,num2)=pedidaDatos()
                calcular(opcion, num1, num2)
            }

            6-> {
                salir=true
                println("Has salido del programa ")
            }

            else -> println("Opción introducida no disponible.")


        }
    }catch (e:Exception){
        println("Error: EL valor introducido no es válido")
    }
    }while (!salir)
}

fun pedidaDatos():Pair<Double,Double> { //Si queremos que la función devuelva dos  valores tendremos que
  //Utilizar la clase Pair que es una estructura de datos inmutable que agrupa y returna dos valores.
    // DECLARACIÓN DE VARIABLES

     var numero1=0.0
     var numero2=0.0
     print("Ingrese el primer numero")
     numero1 = sc.nextDouble()
     print("Ingrese el segundo numero")
     numero2=sc.nextDouble()


     return Pair(numero1,numero2)
}

fun calcular(opcion:Int,num1:Double,num2: Double){
when(opcion){
1->println(" EL RESULTADO ES: ${ num1 + num2}\n")
2->println("EL RESULTADO ES:${num1 - num2}\n")
3->println("EL RESULTADO ES:${num1 * num2}\n")
4->if(num2==0.0) println("NO SE PUEDE DIVIDIR ENTRE CERO")
    else println("RESULTADO: ${num1 / num2}\n")
5->if(num2==0.0) println("NO SE PUEDE DIVIDIR ENTRE CERO")
    else println("RESULTADO:${num1 % num2}\n")
}


}