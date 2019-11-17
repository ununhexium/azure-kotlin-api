package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface TestResultTrendFilter {
  val branchNames: List<String>

  val buildCount: Int

  val definitionIds: List<Int>

  val envDefinitionIds: List<Int>

  val maxCompleteDate: String

  val publishContext: String

  val testRunTitles: List<String>

  val trendDays: Int
}
