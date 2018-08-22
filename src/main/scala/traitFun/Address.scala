package traitFun

import io.circe.{Decoder, Encoder}
import io.circe.generic.semiauto.{deriveDecoder, deriveEncoder}


sealed trait Address

object Address {
  implicit val addressDecoder: Decoder[Address] = deriveDecoder[Address]
  implicit val addressEncoder: Encoder[Address] = deriveEncoder[Address]

}

case class HomeAddress(street: String, city: String,
                   homePhone: String, dogsName:String) extends Address

object HomeAddress  {

  implicit val homeAddressDecoder: Decoder[HomeAddress] = deriveDecoder[HomeAddress]
  implicit val homeAddressEncoder: Encoder[HomeAddress] = deriveEncoder[HomeAddress]

}


case class WorkAddress(street: String, city: String,
                       workPhone: String, floor:String) extends Address

object WorkAddress  {

  implicit val workAddressDecoder: Decoder[WorkAddress] = deriveDecoder[WorkAddress]
  implicit val workAddressEncoder: Encoder[WorkAddress] = deriveEncoder[WorkAddress]

}