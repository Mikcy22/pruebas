  fun suma (a: Int, b: Int) : Int { 
      return a + b
      }
         
      fun resta (a: Int, b: Int) : Int {
      return a - b
      }
         
      fun multi (a: Int, b: Int) : Int {
       return a * b
       }




       fun main() {
       var operacion : (Int, Int) -> Int 
       var res = 0
          
       operacion = ::suma 
       println("La operación suma de 2 y 3, es ${operacion(2,3)}") 
       operacion = ::resta 
       println("La operación resta de 2 y 3, es ${operacion(2,3)}")
       operacion = ::multi
       println("La operación multiplicacion de 2 y 3, es ${operacion(2,3)}")
       }