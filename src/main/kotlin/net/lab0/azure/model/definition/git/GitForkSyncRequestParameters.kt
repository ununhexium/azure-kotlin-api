package net.lab0.azure.model.definition.git

import kotlin.collections.List

/**
 * Parameters for creating a fork request
 */
interface GitForkSyncRequestParameters {
  val source: GlobalGitRepositoryKey

  /**
   * If supplied, the set of ref mappings to use when performing a "sync" or create. If missing, all
   * refs will be synchronized.
   */
  val sourceToTargetRefs: List<SourceToTargetRef>
}
