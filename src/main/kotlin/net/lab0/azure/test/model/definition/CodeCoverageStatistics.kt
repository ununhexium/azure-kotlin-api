package net.lab0.azure.test.model.definition

import javax.json.JsonNumber
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Represents the code coverage statistics for a particular coverage label (modules, statements,
 * blocks, etc.)
 */
interface CodeCoverageStatistics {
  /**
   * Covered units
   */
  val covered: Int

  /**
   * Delta of coverage
   */
  val delta: JsonNumber

  /**
   * Is delta valid
   */
  val isDeltaAvailable: Boolean

  /**
   * Label of coverage data ("Blocks", "Statements", "Modules", etc.)
   */
  val label: String

  /**
   * Position of label
   */
  val position: Int

  /**
   * Total units
   */
  val total: Int
}
