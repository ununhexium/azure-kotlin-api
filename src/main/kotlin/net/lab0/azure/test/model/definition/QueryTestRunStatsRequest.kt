package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String

interface QueryTestRunStatsRequest {
  val teamProjectName: String

  val testRunId: Int
}
