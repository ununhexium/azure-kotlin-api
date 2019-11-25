package net.lab0.azure.model.definition.git

import kotlin.String

/**
 * Status information about a requested merge operation.
 */
interface GitMergeOperationStatusDetail {
  /**
   * Error message if the operation failed.
   */
  val failureMessage: String

  /**
   * The commitId of the resultant merge commit.
   */
  val mergeCommitId: String
}
