package net.lab0.azure.test.model.definition

import kotlin.collections.List

/**
 * Represents the code coverage summary results Used to publish or retrieve code coverage summary
 * against a build
 */
interface CodeCoverageSummary {
  val build: ShallowReference

  /**
   * List of coverage data and details for the build
   */
  val coverageData: List<CodeCoverageData>

  val deltaBuild: ShallowReference
}
