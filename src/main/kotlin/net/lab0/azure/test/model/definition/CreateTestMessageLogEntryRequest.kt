package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface CreateTestMessageLogEntryRequest {
  val projectName: String

  val testMessageLogEntry: List<TestMessageLogEntry>

  val testRunId: Int
}
