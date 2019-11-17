package net.lab0.azure.git.model.definition

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.git.model.definition.enumeration.CommentThreadStatus

/**
 * Represents a comment thread of a pull request. A thread contains meta data about the file it was
 * left on along with one or more comments (an initial comment and the subsequent replies).
 */
interface CommentThread {
  val _links: ReferenceLinks

  /**
   * A list of the comments.
   */
  val comments: List<Comment>

  /**
   * The comment thread id.
   */
  val id: Int

  /**
   * Set of identities related to this thread
   */
  val identities: JsonObject

  /**
   * Specify if the thread is deleted which happens when all comments are deleted.
   */
  val isDeleted: Boolean

  /**
   * The time this thread was last updated.
   */
  val lastUpdatedDate: String

  val properties: PropertiesCollection

  /**
   * The time this thread was published.
   */
  val publishedDate: String

  /**
   * The status of the comment thread.
   */
  val status: CommentThreadStatus

  val threadContext: CommentThreadContext
}
