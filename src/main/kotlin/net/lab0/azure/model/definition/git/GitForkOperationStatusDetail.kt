package net.lab0.azure.model.definition.git

import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * Status information about a requested fork operation.
 */
interface GitForkOperationStatusDetail {
  /**
   * All valid steps for the forking process
   */
  val allSteps: List<String>

  /**
   * Index into AllSteps for the current step
   */
  val currentStep: Int

  /**
   * Error message if the operation failed.
   */
  val errorMessage: String
}
