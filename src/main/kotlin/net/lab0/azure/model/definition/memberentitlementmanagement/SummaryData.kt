package net.lab0.azure.model.definition.memberentitlementmanagement

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
