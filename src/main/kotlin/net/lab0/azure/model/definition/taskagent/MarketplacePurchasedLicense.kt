package net.lab0.azure.model.definition.taskagent

import kotlin.Int
import kotlin.String

/**
 * Represents a purchase of resource units in a secondary marketplace.
 */
interface MarketplacePurchasedLicense {
  /**
   * The Marketplace display name.
   */
  val marketplaceName: String

  /**
   * The name of the identity making the purchase as seen by the marketplace
   */
  val purchaserName: String

  /**
   * The quantity purchased.
   */
  val purchaseUnitCount: Int
}
