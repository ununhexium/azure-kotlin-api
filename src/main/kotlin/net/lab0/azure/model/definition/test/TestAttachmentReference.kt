package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String

/**
 * Reference to test attachment.
 */
interface TestAttachmentReference {
  /**
   * ID of the attachment.
   */
  val id: Int

  /**
   * Url to download the attachment.
   */
  val url: String
}
