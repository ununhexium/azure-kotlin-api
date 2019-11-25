package net.lab0.azure.model.definition.git

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.git.CommentType

/**
 * Represents a comment which is one of potentially many in a comment thread.
 */
interface Comment {
  val _links: ReferenceLinks

  val author: IdentityRef

  /**
   * The comment type at the time of creation.
   */
  val commentType: CommentType

  /**
   * The comment content.
   */
  val content: String

  /**
   * The comment ID. IDs start at 1 and are unique to a pull request.
   */
  val id: Int

  /**
   * Whether or not this comment was soft-deleted.
   */
  val isDeleted: Boolean

  /**
   * The date the comment's content was last updated.
   */
  val lastContentUpdatedDate: String

  /**
   * The date the comment was last updated.
   */
  val lastUpdatedDate: String

  /**
   * The ID of the parent comment. This is used for replies.
   */
  val parentCommentId: Int

  /**
   * The date the comment was first published.
   */
  val publishedDate: String

  /**
   * A list of the users who have liked this comment.
   */
  val usersLiked: List<IdentityRef>
}
