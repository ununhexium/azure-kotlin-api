package net.lab0.azure.work.model.definition

import kotlin.String

/**
 * Represents a shallow ref for a single iteration
 */
interface TeamSettingsIteration : TeamSettingsDataContractBase {
  val attributes: TeamIterationAttributes

  /**
   * Id of the resource
   */
  val id: String

  /**
   * Name of the resource
   */
  val name: String

  /**
   * Relative path of the iteration
   */
  val path: String
}
