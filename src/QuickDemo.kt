import kotlin.test.assertEquals

fun main(args: Array<String>) {
   println("Quick Hello to earth.")
   var holaworld = CiaoWorld()
   holaworld.name = "Hola to the everyone"
   println("Let's spit this out - ${holaworld.name}")

   val a: Int = 100
   val d: Double = 10.00
   val f: Float = 1000.00f
   val l: Long = 1000000005
   val s: Short = 24
   val b: Byte = 2
   println("Value of integer is ${a}")
   println("Value of Double is ${d}")
   println("Value of Float is ${f}")
   println("Value of Long is ${l}")
   println("Value of Short is ${s}")
   println("Value of Byte is ${b}")

   var write: Char
   write = 'A'
   println("Char is ${write}")

   var write2: Boolean
   write2 = true
   println("True or False? ${write2}")

   val answer: String = "42"
   assertEquals(42, answer!!.toInt(), "ding ding ding")
}