  fun imprimeTuNombre (nombre : String){
      println ("Tu nombre es $nombre")
      }
         
      fun main(){
      val myFun = ::imprimeTuNombre 
         
      myFun("Santiago Rodenas Herraiz") 
      myFun("Sonia Mena Delgado") 
       }