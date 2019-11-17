package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String

interface TestActionResult2 {
  val actionPath: String

  val comment: String

  val creationDate: String

  val dateCompleted: String

  val dateStarted: String

  val duration: Int

  val errorMessage: String

  val iterationId: Int

  val lastUpdated: String

  val outcome: String

  val sharedStepId: Int

  val sharedStepRevision: Int

  val testResultId: Int

  val testRunId: Int
}
