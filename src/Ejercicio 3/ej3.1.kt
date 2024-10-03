fun main(){
    val arrayInmutable = listOf (1, 2, 3, 4) //Declaramos una lista inmutable de valores.
    //arrayInmutable[0] = 2 Esto generaría un error de compilación, porque es inmutable. Realmente es una lista de valores constantes.
    val myArray = arrayOf("lunes", "Martes", "Miercoles", "jueves", "Viernes","Sabado", "Domingo") 
    val martes = myArray[1] ;
    val miercoles = myArray.get(2) 
    myArray[3] = "Jueves" 
    myArray.set(0, "Lunes")
       
     myArray.forEach { 
     if (it == "Sabado")
     println("Sabado, el mejor día de la semana")
     else
     println(it)
     }
        
     for (a in myArray)
     if (a == "Domingo")
     println("El domingo, día de reunirse con la familia")
     else
     println (a)
        
     var myArray2 = 0..10 
        
     for (x in myArray2)
     println(x)
        
     for (i in 0..myArray.size -1) 
     print(myArray[i]+" ")
        
     for (i in 0..myArray.size -1 step 2){ 
     print(myArray[i]+" ")
        
     }
        
     for (i in 2 until myArray.size -1){ 
     print(myArray[i]+" ")
     }
        
     for (i in myArray.size -1 downTo 0 ) 
     print(myArray[i]+" ")
        
     for (pos in myArray.indices) 
     println(myArray.get(pos)+" ")
        
        
     for ( (pos, valor) in myArray.withIndex()) 
     println("La posicion $pos tiene de valor $valor")
        
     }