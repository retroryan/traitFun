package traitFun

import grizzled.slf4j.Logging
import io.circe.{Decoder, Encoder}
import io.circe.generic.semiauto.{deriveDecoder, deriveEncoder}

import scala.concurrent.{ExecutionContext, Future}


sealed trait Address

case class HomeAddress(street: String, city: String,
                   homePhone: String, dogsName:String) extends Address

object HomeAddress extends Logging {

  implicit val homeAddressDecoder: Decoder[HomeAddress] = deriveDecoder[HomeAddress]
  implicit val homeAddressEncoder: Encoder[HomeAddress] = deriveEncoder[HomeAddress]

}


case class WorkAddress(street: String, city: String,
                       workPhone: String, floor:String) extends Address

object WorkAddress extends Logging {

  implicit val workAddressDecoder: Decoder[WorkAddress] = deriveDecoder[WorkAddress]
  implicit val workAddressEncoder: Encoder[WorkAddress] = deriveEncoder[WorkAddress]

}