package traitFun

import grizzled.slf4j.Logging
import io.circe._
import io.circe.generic.semiauto._


case class Customer(name:String, address:Address)

object Customer extends Logging {

  implicit val customerDecoder: Decoder[Customer] = deriveDecoder[Customer]
  implicit val customerEncoder: Encoder[Customer] = deriveEncoder[Customer]
}
