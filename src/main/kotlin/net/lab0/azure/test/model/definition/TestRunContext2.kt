package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String

interface TestRunContext2 {
  val buildRefId: Int

  val projectId: String

  val releaseRefId: Int

  val sourceWorkflow: String

  val testRunContextId: Int
}
