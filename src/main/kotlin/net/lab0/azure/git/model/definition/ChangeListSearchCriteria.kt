package net.lab0.azure.git.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * Criteria used in a search for change lists
 */
interface ChangeListSearchCriteria {
  /**
   * If provided, a version descriptor to compare against base
   */
  val compareVersion: String

  /**
   * If true, don't include delete history entries
   */
  val excludeDeletes: Boolean

  /**
   * Whether or not to follow renames for the given item being queried
   */
  val followRenames: Boolean

  /**
   * If provided, only include history entries created after this date (string)
   */
  val fromDate: String

  /**
   * If provided, a version descriptor for the earliest change list to include
   */
  val fromVersion: String

  /**
   * Path of item to search under. If the itemPaths memebr is used then it will take precedence over
   * this.
   */
  val itemPath: String

  /**
   * List of item paths to search under. If this member is used then itemPath will be ignored.
   */
  val itemPaths: List<String>

  /**
   * Version of the items to search
   */
  val itemVersion: String

  /**
   * Number of results to skip (used when clicking more...)
   */
  val skip: Int

  /**
   * If provided, only include history entries created before this date (string)
   */
  val toDate: String

  /**
   * If provided, the maximum number of history entries to return
   */
  val top: Int

  /**
   * If provided, a version descriptor for the latest change list to include
   */
  val toVersion: String

  /**
   * Alias or display name of user who made the changes
   */
  val user: String
}
