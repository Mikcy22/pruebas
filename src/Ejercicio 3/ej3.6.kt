  fun main() {
      val myArray = intArrayOf(5, 2, 9, 1, 7)
      val sortedArray = myArray.sorted() 
      println("Ordenado de menor a mayor: $sortedArray")
      val sortedArrayDescending = myArray.sortedDescending() 
      println("Ordenado de mayor a menor: $sortedArrayDescending")
      }

