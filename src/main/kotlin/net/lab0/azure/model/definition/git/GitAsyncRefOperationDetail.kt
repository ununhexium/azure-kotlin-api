package net.lab0.azure.model.definition.git

import javax.json.JsonNumber
import kotlin.Boolean
import kotlin.String
import net.lab0.azure.model.definition.enumeration.git.GitAsyncRefOperationFailureStatus

/**
 * Information about the progress of a cherry pick or revert operation.
 */
interface GitAsyncRefOperationDetail {
  /**
   * Indicates if there was a conflict generated when trying to cherry pick or revert the changes.
   */
  val conflict: Boolean

  /**
   * The current commit from the list of commits that are being cherry picked or reverted.
   */
  val currentCommitId: String

  /**
   * Detailed information about why the cherry pick or revert failed to complete.
   */
  val failureMessage: String

  /**
   * A number between 0 and 1 indicating the percent complete of the operation.
   */
  val progress: JsonNumber

  /**
   * Provides a status code that indicates the reason the cherry pick or revert failed.
   */
  val status: GitAsyncRefOperationFailureStatus

  /**
   * Indicates if the operation went beyond the maximum time allowed for a cherry pick or revert
   * operation.
   */
  val timedout: Boolean
}
