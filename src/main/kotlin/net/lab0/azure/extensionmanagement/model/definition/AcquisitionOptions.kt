package net.lab0.azure.extensionmanagement.model.definition

import kotlin.String
import kotlin.collections.List

/**
 * Market item acquisition options (install, buy, etc) for an installation target.
 */
interface AcquisitionOptions {
  val defaultOperation: AcquisitionOperation

  /**
   * The item id that this options refer to
   */
  val itemId: String

  /**
   * Operations allowed for the ItemId in this target
   */
  val operations: List<AcquisitionOperation>

  val properties: JObject

  /**
   * The target that this options refer to
   */
  val target: String
}
