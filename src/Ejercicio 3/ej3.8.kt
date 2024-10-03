  fun main() {
      val pairsArray = arrayOf(
      "Santi" to 25,
      "Sonia" to 30,
      "Guille" to 15,
      "Diego" to 10
      ) 
         
      val mapFromArray = pairsArray.toMap()
       println("Convertido a Map: $mapFromArray")
          
       val anotherMap = mapOf(
       "Santi" to 25,
       "Sonia" to 30,
       "Guille" to 15,
       "Diego" to 10
       ) 
       println("Otro Map creado directamente: $anotherMap")
       }