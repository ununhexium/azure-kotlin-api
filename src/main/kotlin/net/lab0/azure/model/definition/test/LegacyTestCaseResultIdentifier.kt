package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String

interface LegacyTestCaseResultIdentifier {
  val areaUri: String

  val testResultId: Int

  val testRunId: Int
}
