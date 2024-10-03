fun main(){
    val myArray : Array<Pair<String, Int>> = arrayOf(
  "Santi" to 25,
  "Sonia" to 30,
  "Guille" to 15,
  "Diego" to 10
  )
  val myMap : Map<String, Int> = myArray.toMap()
  
  myMap.forEach{ clave, valor -> println("Clave: $clave, Valor: $valor")}
}