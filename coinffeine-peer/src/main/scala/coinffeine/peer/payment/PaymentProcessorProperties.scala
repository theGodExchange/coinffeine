package coinffeine.peer.payment

import coinffeine.common.properties.Property
import coinffeine.model.currency.FiatAmounts
import coinffeine.model.util.Cached

trait PaymentProcessorProperties {
  val balances: Property[Cached[FiatAmounts]]
  val remainingLimits: Property[Cached[FiatAmounts]]
}
