package net.lab0.azure.model.definition.git

import kotlin.Int
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.git.GitAsyncOperationStatus

/**
 * Request to sync data between two forks.
 */
interface GitForkSyncRequest {
  val _links: ReferenceLinks

  val detailedStatus: GitForkOperationStatusDetail

  /**
   * Unique identifier for the operation.
   */
  val operationId: Int

  val source: GlobalGitRepositoryKey

  /**
   * If supplied, the set of ref mappings to use when performing a "sync" or create. If missing, all
   * refs will be synchronized.
   */
  val sourceToTargetRefs: List<SourceToTargetRef>

  val status: GitAsyncOperationStatus
}
