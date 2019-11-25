package net.lab0.azure.model.definition.git

import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Metadata for a changeset.
 */
interface TfvcChangesetRef {
  val _links: ReferenceLinks

  val author: IdentityRef

  /**
   * Changeset Id.
   */
  val changesetId: Int

  val checkedInBy: IdentityRef

  /**
   * Comment for the changeset.
   */
  val comment: String

  /**
   * Was the Comment result truncated?
   */
  val commentTruncated: Boolean

  /**
   * Creation date of the changeset.
   */
  val createdDate: String

  /**
   * URL to retrieve the item.
   */
  val url: String
}
