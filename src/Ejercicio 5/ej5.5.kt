  fun operacion (a: Int, b: Int, fn : ( Int, Int ) -> Int) = fn (a,b) 
  //Aquí está lo bueno. Invocamos a la función pasada como argumento.

  fun main(){
  var res = operacion(2, 3) { 
  a, b -> a + b
  }
  println("La operación suma de 2 y 3, es $res")
 
  res = operacion (2, 3 ) { 
   a, b -> a - b
   }
   println("La operación suma de 2 y 3, es $res")
  
   }