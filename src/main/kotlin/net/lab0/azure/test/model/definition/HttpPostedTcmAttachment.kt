package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String

interface HttpPostedTcmAttachment {
  val attachmentContent: String

  val contentLength: Int

  val contentType: String

  val fileName: String
}
