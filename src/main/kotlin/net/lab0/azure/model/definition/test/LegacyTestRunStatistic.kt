package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String

interface LegacyTestRunStatistic {
  val count: Int

  val outcome: String

  val resolutionState: TestResolutionState

  val state: String

  val testRunId: Int
}
