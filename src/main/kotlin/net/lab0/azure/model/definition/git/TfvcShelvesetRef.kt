package net.lab0.azure.model.definition.git

import kotlin.Boolean
import kotlin.String

/**
 * Metadata for a shallow shelveset.
 */
interface TfvcShelvesetRef {
  val _links: ReferenceLinks

  /**
   * Shelveset comment.
   */
  val comment: String

  /**
   * Shelveset comment truncated as applicable.
   */
  val commentTruncated: Boolean

  /**
   * Shelveset create date.
   */
  val createdDate: String

  /**
   * Shelveset Id.
   */
  val id: String

  /**
   * Shelveset name.
   */
  val name: String

  val owner: IdentityRef

  /**
   * Shelveset Url.
   */
  val url: String
}
