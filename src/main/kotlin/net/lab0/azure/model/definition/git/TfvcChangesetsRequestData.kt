package net.lab0.azure.model.definition.git

import kotlin.Boolean
import kotlin.Int
import kotlin.collections.List

/**
 * Request body for Get batched changesets.
 */
interface TfvcChangesetsRequestData {
  /**
   * List of changeset Ids.
   */
  val changesetIds: List<Int>

  /**
   * Max length of the comment.
   */
  val commentLength: Int

  /**
   * Whether to include the _links field on the shallow references
   */
  val includeLinks: Boolean
}
