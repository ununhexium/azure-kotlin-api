package net.lab0.azure.testplan.model.definition

import kotlin.Int

interface CloneStatistics {
  /**
   * Number of Requirments cloned so far.
   */
  val clonedRequirementsCount: Int

  /**
   * Number of shared steps cloned so far.
   */
  val clonedSharedStepsCount: Int

  /**
   * Number of test cases cloned so far
   */
  val clonedTestCasesCount: Int

  /**
   * Total number of requirements to be cloned
   */
  val totalRequirementsCount: Int

  /**
   * Total number of test cases to be cloned
   */
  val totalTestCasesCount: Int
}
