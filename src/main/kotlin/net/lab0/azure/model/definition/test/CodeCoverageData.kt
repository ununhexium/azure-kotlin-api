package net.lab0.azure.model.definition.test

import kotlin.String
import kotlin.collections.List

/**
 * Represents the build configuration (platform, flavor) and coverage data for the build
 */
interface CodeCoverageData {
  /**
   * Flavor of build for which data is retrieved/published
   */
  val buildFlavor: String

  /**
   * Platform of build for which data is retrieved/published
   */
  val buildPlatform: String

  /**
   * List of coverage data for the build
   */
  val coverageStats: List<CodeCoverageStatistics>
}
