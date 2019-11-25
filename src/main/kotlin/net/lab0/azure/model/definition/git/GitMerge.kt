package net.lab0.azure.model.definition.git

import kotlin.Int
import net.lab0.azure.model.definition.enumeration.git.GitAsyncOperationStatus

interface GitMerge : GitMergeParameters {
  val _links: ReferenceLinks

  val detailedStatus: GitMergeOperationStatusDetail

  /**
   * Unique identifier for the merge operation.
   */
  val mergeOperationId: Int

  /**
   * Status of the merge operation.
   */
  val status: GitAsyncOperationStatus
}
