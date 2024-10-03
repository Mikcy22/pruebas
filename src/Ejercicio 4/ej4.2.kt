fun devuelveSumaArray(myArray: Array<Int>):Int{ 
      var suma=0
      for (i in myArray.indices)
      suma+= myArray[i]
         
      return suma
      }
         
          
      fun devuelveSumaArray1(myArray: IntRange):Int{ 
       var suma=0
       for (x in myArray)
       suma+=x
          
       return suma
       }
          
       fun main(){
       val myRange = 1..50
       val myArray = myRange.toList().toTypedArray() 
       println ("La suma del array completo es ${devuelveSumaArray(myArray)}")
       println ("La suma del array completo es ${devuelveSumaArray1(myRange)}")
       }