package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface TestResultReset2 {
  val auditIdentity: String

  val dateModified: String

  val projectId: String

  val revision: Int

  val testResultId: Int

  val testResultRV: List<String>

  val testRunId: Int
}
