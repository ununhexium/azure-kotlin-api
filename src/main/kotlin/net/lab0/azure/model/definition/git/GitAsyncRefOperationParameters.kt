package net.lab0.azure.model.definition.git

import kotlin.String

/**
 * Parameters that are provided in the request body when requesting to cherry pick or revert.
 */
interface GitAsyncRefOperationParameters {
  /**
   * Proposed target branch name for the cherry pick or revert operation.
   */
  val generatedRefName: String

  /**
   * The target branch for the cherry pick or revert operation.
   */
  val ontoRefName: String

  val repository: GitRepository

  val source: GitAsyncRefOperationSource
}
