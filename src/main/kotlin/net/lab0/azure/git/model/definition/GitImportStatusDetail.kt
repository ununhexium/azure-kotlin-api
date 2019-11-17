package net.lab0.azure.git.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * Additional status information about an import request.
 */
interface GitImportStatusDetail {
  /**
   * All valid steps for the import process
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
