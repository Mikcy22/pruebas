fun main(){
      var myArray = Array(5){ it + 1 }
  val myList = myArray.map { it * 2 }
  myArray = myList.toTypedArray()
  val final = myArray.mapIndexed { index, value -> index * value }.toTypedArray()
  final.forEach{ println (it)}
}