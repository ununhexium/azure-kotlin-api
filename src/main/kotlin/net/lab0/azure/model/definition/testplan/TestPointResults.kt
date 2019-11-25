package net.lab0.azure.model.definition.testplan

import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.testplan.FailureType
import net.lab0.azure.model.definition.enumeration.testplan.LastResolutionState
import net.lab0.azure.model.definition.enumeration.testplan.Outcome
import net.lab0.azure.model.definition.enumeration.testplan.PointState
import net.lab0.azure.model.definition.enumeration.testplan.ResultState

/**
 * Test Point Results
 */
interface TestPointResults {
  /**
   * Failure Type for the Test Point
   */
  val failureType: FailureType

  /**
   * Last Resolution State Id for the TEst Point
   */
  val lastResolutionState: LastResolutionState

  val lastResultDetails: LastResultDetails

  /**
   * Last Result Id
   */
  val lastResultId: Int

  /**
   * Last Result State of the Test Point
   */
  val lastResultState: ResultState

  /**
   * Last RUn Build Number for the Test Point
   */
  val lastRunBuildNumber: String

  /**
   * Last Test Run Id for the Test Point
   */
  val lastTestRunId: Int

  /**
   * Outcome of the Test Point
   */
  val outcome: Outcome

  /**
   * State of the Test Point
   */
  val state: PointState
}
