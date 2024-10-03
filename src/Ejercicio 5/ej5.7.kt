  import kotlin.random.Random
 
  fun printValuesOfArr(arr: IntArray, fn: (Int) -> Boolean) {
  val filteredArr = arr.filter(fn) 
  println(filteredArr.joinToString(", ")) 
  }
 
  fun loadData(): IntArray {
  return IntArray(10) { Random.nextInt(0, 99) }
   }
  
   fun main() {
   val myArr = loadData()
  
   printValuesOfArr(myArr) { true }
   printValuesOfArr(myArr) { it % 2 == 0 }
   printValuesOfArr(myArr) { it % 3 == 0 || it % 5 == 0 }
   printValuesOfArr(myArr) { it >= 50 }
   printValuesOfArr(myArr) {
   when (it) {
   in 1..10, in 20..30, in 90..95 -> true
   else -> false
   }
   }
   }