  fun main() {
      val originalPrices = doubleArrayOf(100.0, 150.0, 200.0, 250.0)
      val increasedPrices = originalPrices.map { price -> price * 1.20 }
         
      println("Precios originales: ${originalPrices.joinToString(", ")}")
      println("Precios incrementados en un 20%: $increasedPrices")
      }