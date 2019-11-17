package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String
import net.lab0.azure.test.model.definition.enumeration.AttachmentType

interface TestAttachment {
  /**
   * Attachment type.
   */
  val attachmentType: AttachmentType

  /**
   * Comment associated with attachment.
   */
  val comment: String

  /**
   * Attachment created date.
   */
  val createdDate: String

  /**
   * Attachment file name
   */
  val fileName: String

  /**
   * ID of the attachment.
   */
  val id: Int

  /**
   * Attachment size.
   */
  val size: Int

  /**
   * Attachment Url.
   */
  val url: String
}
