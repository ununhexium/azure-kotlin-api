package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface ModuleCoverage {
  val blockCount: Int

  val blockData: List<String>

  /**
   * Code Coverage File Url
   */
  val fileUrl: String

  val functions: List<FunctionCoverage>

  val name: String

  val signature: String

  val signatureAge: Int

  val statistics: CoverageStatistics
}
