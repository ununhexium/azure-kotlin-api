package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String

interface QueryTestRunStatsRequest {
  val teamProjectName: String

  val testRunId: Int
}
