package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String

interface LegacyTestRunStatistic {
  val count: Int

  val outcome: String

  val resolutionState: TestResolutionState

  val state: String

  val testRunId: Int
}
