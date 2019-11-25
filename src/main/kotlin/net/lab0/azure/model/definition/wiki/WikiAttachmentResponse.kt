package net.lab0.azure.model.definition.wiki

import kotlin.String
import kotlin.collections.List

/**
 * Response contract for the Wiki Attachments API
 */
interface WikiAttachmentResponse {
  val attachment: WikiAttachment

  /**
   * Contains the list of ETag values from the response header of the attachments API call. The
   * first item in the list contains the version of the wiki attachment.
   */
  val eTag: List<String>
}
