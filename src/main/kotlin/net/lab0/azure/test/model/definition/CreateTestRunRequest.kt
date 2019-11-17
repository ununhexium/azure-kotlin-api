package net.lab0.azure.test.model.definition

import kotlin.String
import kotlin.collections.List

interface CreateTestRunRequest {
  val projectName: String

  val results: List<LegacyTestCaseResult>

  val testRun: LegacyTestRun

  val testSettings: LegacyTestSettings
}
