package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.collections.List

interface TestFailureDetails {
  val count: Int

  val testResults: List<TestCaseResultIdentifier>
}
