package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String

interface TestResult2 {
  val afnStripId: Int

  val computerName: String

  val creationDate: String

  val dateCompleted: String

  val dateStarted: String

  val effectivePointState: String

  val failureType: String

  val lastUpdated: String

  val lastUpdatedBy: String

  val outcome: String

  val owner: String

  val projectId: String

  val resetCount: Int

  val resolutionStateId: Int

  val revision: Int

  val runBy: String

  val state: String

  val testCaseRefId: Int

  val testResultId: Int

  val testRunId: Int
}
