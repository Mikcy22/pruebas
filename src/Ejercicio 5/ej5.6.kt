  import kotlin.random.Random
 
  fun printValuesOfArr(arr : IntArray, fn : (Int) -> Boolean): Unit{
  var newArr = IntArray(10) {-1} 
  var j = 0
  for (i in arr.indices){
  if (fn (arr[i])){
  newArr[j] = arr[i] 
  j++
   }
   }
   for (i in newArr){ 
   print("$i, ")
   }
   }
  
   fun loadData(): IntArray{ 
   var myArr = IntArray(10)
   for (i in myArr.indices)
   myArr[i] = Random.nextInt(0, 99)
   return myArr
  
   }
  
     fun main(){
   var myArr = loadData()
   printValuesOfArr(myArr){true} 
   println()
  
   printValuesOfArr(myArr){ v-> v % 2 == 0 } 
   println()
  
   printValuesOfArr(myArr){
   if (it % 3 == 0 || it % 5 == 0) true 
   else false
   }
   println()
  
   printValuesOfArr(myArr){ it >= 50 } 
   println()
  
   printValuesOfArr(myArr){ 
   when (it){
   in 1..10 -> true
   in 20..30 -> true
   in 90..95 -> true
   else -> false
   }
   }
   }