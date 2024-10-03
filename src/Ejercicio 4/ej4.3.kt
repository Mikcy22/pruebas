  fun modificarNumero(numero: Int) {
      var copiaNumero = numero
      copiaNumero += 5 ①
      println("Dentro de la función: $copiaNumero")
      }
         
      fun main() {
      val numero = 10
      modificarNumero(numero)
       println("Después de la función: $numero") ②
       }