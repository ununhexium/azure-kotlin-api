package net.lab0.azure.model.definition.git

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * Criteria used in a search for change lists.
 */
interface TfvcChangesetSearchCriteria {
  /**
   * Alias or display name of user who made the changes.
   */
  val author: String

  /**
   * Whether or not to follow renames for the given item being queried.
   */
  val followRenames: Boolean

  /**
   * If provided, only include changesets created after this date (string).
   */
  val fromDate: String

  /**
   * If provided, only include changesets after this changesetID.
   */
  val fromId: Int

  /**
   * Whether to include the _links field on the shallow references.
   */
  val includeLinks: Boolean

  /**
   * Path of item to search under.
   */
  val itemPath: String

  val mappings: List<TfvcMappingFilter>

  /**
   * If provided, only include changesets created before this date (string).
   */
  val toDate: String

  /**
   * If provided, a version descriptor for the latest change list to include.
   */
  val toId: Int
}
