package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String

interface PointsResults2 {
  val changeNumber: Int

  val lastFailureType: String

  val lastResolutionStateId: Int

  val lastResultOutcome: String

  val lastResultState: String

  val lastTestResultId: Int

  val lastTestRunId: Int

  val lastUpdated: String

  val planId: Int

  val pointId: Int
}
