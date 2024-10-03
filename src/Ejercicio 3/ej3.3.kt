fun main(){
    val myArray = IntArray(5) {it}
    val myArray1 = arrayOf(1, 2, 3.3, "santi") //Creamos e inmicializamos un array de elementos genéricos, de cualquier tipo. Any
    val myArray2 = intArrayOf(1, 2, 3, 4) //Lo mismo que antes, pero especificamos un array de sólo enteros.
    val myArray3 = doubleArrayOf(1.4, 2.6) //Sólo reales
    val myArray4 = Array(5) { it*2 } //Objeto Array de 5 elementos y los inicializamos multiplicando su índice por 2. Sólo inicializamos con lambda.
    val myArray5 = Array(5) { 
      index-> //Detro de su lambda, podemos realizar una serie de comprobaciones.
        when (index){
        0 -> 1.4
        1 -> 2.5
        3 -> 5.3
        else -> 0.0
        }
     }
  
  myArray.forEach{ 
    println(it); 
  }

  myArray2.forEachIndexed { 
    indice, valor -> println("Elemento en $indice: $valor") 

  }
}