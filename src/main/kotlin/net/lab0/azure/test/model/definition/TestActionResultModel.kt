package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String

/**
 * Represents a test step result.
 */
interface TestActionResultModel : TestResultModelBase {
  /**
   * Path identifier test step in test case workitem.
   */
  val actionPath: String

  /**
   * Iteration ID of test action result.
   */
  val iterationId: Int

  val sharedStepModel: SharedStepModel

  /**
   * This is step Id of test case. For shared step, it is step Id of shared step in test case
   * workitem; step Id in shared step. Example: TestCase workitem has two steps: 1) Normal step with Id
   * = 1 2) Shared Step with Id = 2. Inside shared step: a) Normal Step with Id = 1 Value for
   * StepIdentifier for First step: "1" Second step: "2;1"
   */
  val stepIdentifier: String

  /**
   * Url of test action result.
   */
  val url: String
}
