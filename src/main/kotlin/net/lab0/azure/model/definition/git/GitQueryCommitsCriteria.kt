package net.lab0.azure.model.definition.git

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.git.GitHistoryMode

interface GitQueryCommitsCriteria {
  /**
   * Number of entries to skip
   */
  val skip: Int

  /**
   * Maximum number of entries to retrieve
   */
  val top: Int

  /**
   * Alias or display name of the author
   */
  val author: String

  val compareVersion: GitVersionDescriptor

  /**
   * Only applies when an itemPath is specified. This determines whether to exclude delete entries
   * of the specified path.
   */
  val excludeDeletes: Boolean

  /**
   * If provided, a lower bound for filtering commits alphabetically
   */
  val fromCommitId: String

  /**
   * If provided, only include history entries created after this date (string)
   */
  val fromDate: String

  /**
   * What Git history mode should be used. This only applies to the search criteria when Ids = null
   * and an itemPath is specified.
   */
  val historyMode: GitHistoryMode

  /**
   * If provided, specifies the exact commit ids of the commits to fetch. May not be combined with
   * other parameters.
   */
  val ids: List<String>

  /**
   * Whether to include the _links field on the shallow references
   */
  val includeLinks: Boolean

  /**
   * Whether to include the push information
   */
  val includePushData: Boolean

  /**
   * Whether to include the image Url for committers and authors
   */
  val includeUserImageUrl: Boolean

  /**
   * Whether to include linked work items
   */
  val includeWorkItems: Boolean

  /**
   * Path of item to search under
   */
  val itemPath: String

  val itemVersion: GitVersionDescriptor

  /**
   * If provided, an upper bound for filtering commits alphabetically
   */
  val toCommitId: String

  /**
   * If provided, only include history entries created before this date (string)
   */
  val toDate: String

  /**
   * Alias or display name of the committer
   */
  val user: String
}
