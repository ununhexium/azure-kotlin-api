package net.lab0.azure.git.model.definition

import kotlin.Int
import kotlin.String

/**
 * Meta data for a file attached to an artifact.
 */
interface Attachment {
  val _links: ReferenceLinks

  val author: IdentityRef

  /**
   * Content hash of on-disk representation of file content. Its calculated by the server by using
   * SHA1 hash function.
   */
  val contentHash: String

  /**
   * The time the attachment was uploaded.
   */
  val createdDate: String

  /**
   * The description of the attachment.
   */
  val description: String

  /**
   * The display name of the attachment. Can't be null or empty.
   */
  val displayName: String

  /**
   * Id of the attachment.
   */
  val id: Int

  val properties: PropertiesCollection

  /**
   * The url to download the content of the attachment.
   */
  val url: String
}
