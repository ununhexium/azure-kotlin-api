package net.lab0.azure.memberentitlementmanagement.model.definition

import kotlin.Int

interface SummaryData {
  /**
   * Count of Licenses already assigned.
   */
  val assigned: Int

  /**
   * Available Count.
   */
  val available: Int

  /**
   * Quantity
   */
  val includedQuantity: Int

  /**
   * Total Count.
   */
  val total: Int
}
