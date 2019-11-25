package net.lab0.azure.model.definition.test

import kotlin.String

interface FunctionCoverage {
  val `class`: String

  val name: String

  val namespace: String

  val sourceFile: String

  val statistics: CoverageStatistics
}
