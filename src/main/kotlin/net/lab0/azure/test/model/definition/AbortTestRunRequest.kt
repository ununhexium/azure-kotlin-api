package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String

interface AbortTestRunRequest {
  val options: Int

  val projectName: String

  val revision: Int

  val testRunId: Int
}
