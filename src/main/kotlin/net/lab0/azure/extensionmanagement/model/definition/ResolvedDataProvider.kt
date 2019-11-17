package net.lab0.azure.extensionmanagement.model.definition

import kotlin.String

/**
 * Entry for a specific data provider's resulting data
 */
interface ResolvedDataProvider {
  /**
   * The total time the data provider took to resolve its data (in milliseconds)
   */
  val duration: String

  val error: String

  val id: String
}
