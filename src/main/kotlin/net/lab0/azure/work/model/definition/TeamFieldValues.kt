package net.lab0.azure.work.model.definition

import kotlin.String
import kotlin.collections.List

/**
 * Essentially a collection of team field values
 */
interface TeamFieldValues : TeamSettingsDataContractBase {
  /**
   * The default team field value
   */
  val defaultValue: String

  val field: FieldReference

  /**
   * Collection of all valid team field values
   */
  val values: List<TeamFieldValue>
}
