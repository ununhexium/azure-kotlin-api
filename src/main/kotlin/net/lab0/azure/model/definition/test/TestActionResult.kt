package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String

interface TestActionResult {
  val actionPath: String

  val comment: String

  val creationDate: String

  val dateCompleted: String

  val dateStarted: String

  val duration: Int

  val errorMessage: String

  val id: LegacyTestCaseResultIdentifier

  val iterationId: Int

  val lastUpdated: String

  val lastUpdatedBy: String

  val outcome: String

  val sharedStepId: Int

  val sharedStepRevision: Int
}
