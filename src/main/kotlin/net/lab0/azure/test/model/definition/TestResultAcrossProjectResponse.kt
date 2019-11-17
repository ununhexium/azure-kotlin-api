package net.lab0.azure.test.model.definition

import kotlin.String

interface TestResultAcrossProjectResponse {
  val projectName: String

  val testResult: LegacyTestCaseResult
}
