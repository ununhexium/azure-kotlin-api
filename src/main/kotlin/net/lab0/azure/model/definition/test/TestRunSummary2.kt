package net.lab0.azure.model.definition.test

import kotlin.Boolean
import kotlin.Int
import kotlin.String

interface TestRunSummary2 {
  val isRerun: Boolean

  val projectId: String

  val resultCount: Int

  val resultDuration: Int

  val runDuration: Int

  val testOutcome: String

  val testRunCompletedDate: String

  val testRunContextId: Int

  val testRunId: Int

  val testRunStatsId: Int
}
