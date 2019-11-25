package net.lab0.azure.model.definition.test

import kotlin.String
import kotlin.collections.List

interface CreateTestRunRequest {
  val projectName: String

  val results: List<LegacyTestCaseResult>

  val testRun: LegacyTestRun

  val testSettings: LegacyTestSettings
}
