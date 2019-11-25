package net.lab0.azure.model.definition.release

import kotlin.String

interface IgnoredGate {
  /**
   * Gets the date on which gate is last ignored.
   */
  val lastModifiedOn: String

  /**
   * Name of gate ignored.
   */
  val name: String
}
