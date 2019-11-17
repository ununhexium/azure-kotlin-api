package net.lab0.azure.git.model.definition

import kotlin.Int
import kotlin.collections.List

/**
 * A change.
 */
interface TfvcChange : Change {
  /**
   * List of merge sources in case of rename or branch creation.
   */
  val mergeSources: List<TfvcMergeSource>

  /**
   * Version at which a (shelved) change was pended against
   */
  val pendingVersion: Int
}
