  import kotlin.random.Random
 
  fun loadData(): IntArray{ 
  var myArr = IntArray(10) 
  for (i in myArr.indices)
  myArr[i] = Random.nextInt(0, 99)
  return myArr 
  }
 
   fun printValuesOfArr (arr: IntArray){ 
    for (i in arr.indices)
        if ( i < arr.size -1)
            print ("${arr[i]}, ")
        else
            print ("${arr[i]}")
   }
  
   fun main(){
   var myArr = loadData() 
   printValuesOfArr(myArr)
   }