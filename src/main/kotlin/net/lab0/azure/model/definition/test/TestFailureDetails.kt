package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.collections.List

interface TestFailureDetails {
  val count: Int

  val testResults: List<TestCaseResultIdentifier>
}
