package net.lab0.azure.workitemtrackingprocesstemplate.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Describes result of process operation promote.
 */
interface ProcessPromoteStatus {
  /**
   * Number of projects for which promote is complete.
   */
  val complete: Int

  /**
   * ID of the promote operation.
   */
  val id: String

  /**
   * The error message assoicated with the promote operation. The string will be empty if there are
   * no errors.
   */
  val message: String

  /**
   * Number of projects for which promote is pending.
   */
  val pending: Int

  /**
   * The remaining retries.
   */
  val remainingRetries: Int

  /**
   * True if promote finished all the projects successfully. False if still inprogress or any
   * project promote failed.
   */
  val successful: Boolean
}
