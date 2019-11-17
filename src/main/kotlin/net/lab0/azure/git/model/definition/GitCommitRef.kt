package net.lab0.azure.git.model.definition

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

/**
 * Provides properties that describe a Git commit and associated metadata.
 */
interface GitCommitRef {
  val _links: ReferenceLinks

  val author: GitUserDate

  val changeCounts: ChangeCountDictionary

  /**
   * An enumeration of the changes included with the commit.
   */
  val changes: List<GitChange>

  /**
   * Comment or message of the commit.
   */
  val comment: String

  /**
   * Indicates if the comment is truncated from the full Git commit comment message.
   */
  val commentTruncated: Boolean

  /**
   * ID (SHA-1) of the commit.
   */
  val commitId: String

  val committer: GitUserDate

  /**
   * An enumeration of the parent commit IDs for this commit.
   */
  val parents: List<String>

  val push: GitPushRef

  /**
   * Remote URL path to the commit.
   */
  val remoteUrl: String

  /**
   * A list of status metadata from services and extensions that may associate additional
   * information to the commit.
   */
  val statuses: List<GitStatus>

  /**
   * REST URL for this resource.
   */
  val url: String

  /**
   * A list of workitems associated with this commit.
   */
  val workItems: List<ResourceRef>
}
