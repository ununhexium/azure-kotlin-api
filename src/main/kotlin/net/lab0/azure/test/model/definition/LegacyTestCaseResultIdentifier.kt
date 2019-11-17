package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String

interface LegacyTestCaseResultIdentifier {
  val areaUri: String

  val testResultId: Int

  val testRunId: Int
}
