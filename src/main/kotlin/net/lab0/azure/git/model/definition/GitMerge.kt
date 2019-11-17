package net.lab0.azure.git.model.definition

import kotlin.Int
import net.lab0.azure.git.model.definition.enumeration.GitAsyncOperationStatus

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
