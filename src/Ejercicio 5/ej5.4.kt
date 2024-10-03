  fun suma (a: Int, b: Int): Int = a + b ;
  fun resta (a: Int, b: Int): Int = a - b;
  
  fun operacion (a: Int, b: Int, fn: (Int, Int)-> Int): Int = fn (a,b) 
 
  fun main(){
  println("La operación suma de 2 y 3, es ${operacion(2,3, ::suma)}") 
  println("La operación resta de 2 y 3, es ${operacion(2,3, ::resta)}") 
  }