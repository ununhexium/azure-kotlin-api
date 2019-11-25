package net.lab0.azure.model.definition.test

import kotlin.String

interface TestResultAcrossProjectResponse {
  val projectName: String

  val testResult: LegacyTestCaseResult
}
