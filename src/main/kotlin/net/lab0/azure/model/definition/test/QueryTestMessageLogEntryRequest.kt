package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String

interface QueryTestMessageLogEntryRequest {
  val projectName: String

  val testMessageLogId: Int

  val testRunId: Int
}
