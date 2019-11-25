package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String

interface AbortTestRunRequest {
  val options: Int

  val projectName: String

  val revision: Int

  val testRunId: Int
}
