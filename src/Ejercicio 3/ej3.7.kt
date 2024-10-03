  fun main() {
      val myArray = intArrayOf(5, 2, 9, 1, 7)
      val listFromArray = myArray.toList() ①
      println("Convertido a List: $listFromArray")
          
      val mutableListFromArray = myArray.toMutableList() ②
      println("Convertido a MutableList: $mutableListFromArray")
         
      val setFromArray = myArray.toSet() ③
       println("Convertido a Set: $setFromArray")
       }