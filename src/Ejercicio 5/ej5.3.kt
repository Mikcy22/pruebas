  fun main(){
      var operacion : (Int, Int) -> Int = {a, b -> a + b } 
      println("La operación suma de 2 y 3, es ${operacion(2,3)}") 
      operacion = { a, b -> a - b } 
      println("La operación resta de 2 y 3, es ${operacion(2,3)}")
      operacion = { a, b -> a * b }
      println("La operación multiplicacion de 2 y 3, es ${operacion(2,3)}")
      }