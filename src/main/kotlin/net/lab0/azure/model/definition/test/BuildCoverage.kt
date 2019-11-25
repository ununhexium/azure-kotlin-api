package net.lab0.azure.model.definition.test

import kotlin.String
import kotlin.collections.List

/**
 * Build Coverage Detail
 */
interface BuildCoverage {
  /**
   * Code Coverage File Url
   */
  val codeCoverageFileUrl: String

  val configuration: BuildConfiguration

  /**
   * Last Error
   */
  val lastError: String

  /**
   * List of Modules
   */
  val modules: List<ModuleCoverage>

  /**
   * State
   */
  val state: String
}
