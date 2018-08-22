package traitFun

import io.circe._
import io.circe.generic.semiauto._


case class Customer(name:String, address: Address)

object Customer  {

  implicit val customerDecoder: Decoder[Customer] = deriveDecoder[Customer]
  implicit val customerEncoder: Encoder[Customer] = deriveEncoder[Customer]
}
