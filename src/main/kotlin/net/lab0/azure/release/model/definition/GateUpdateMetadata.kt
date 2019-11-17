package net.lab0.azure.release.model.definition

import kotlin.String
import kotlin.collections.List

interface GateUpdateMetadata {
  /**
   * Comment
   */
  val comment: String

  /**
   * Name of gate to be ignored.
   */
  val gatesToIgnore: List<String>
}
