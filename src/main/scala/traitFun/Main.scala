package traitFun

import io.circe.generic.auto._
import io.circe.syntax._

object Main  {

  def main(args: Array[String]): Unit = {

    val ha = HomeAddress("Main Street", "Park City","801555", "Spot" )
    ha.asJson

    val wa = WorkAddress("3rd Street", "San Francisco","403555", "Floor 5" )
    wa.asJson

    val c1 = Customer("Flo", ha)
    val j1 = c1.asJson
    println(s"j1: $j1")

    val c2 = Customer("Walter", wa)
    val j2 = c2.asJson
    println(s"j2: $j2")

  }
}
