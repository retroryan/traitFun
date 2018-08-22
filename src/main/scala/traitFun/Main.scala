package traitFun

import grizzled.slf4j.Logging
import io.circe.generic.auto._
import io.circe.syntax._

object Main extends Logging {

  def main(args: Array[String]): Unit = {

    val ha = HomeAddress("Main Street", "Park City","801555", "Spot" )
    ha.asJson

    val wa = WorkAddress("3rd Street", "San Francisco","403555", "Floor 5" )
    wa.asJson

    val c1 = Customer("Flo", ha)
    c1.asJson

    val c2 = Customer("Walter", wa)
    wa.asJson
  }
}
