package net.lab0.azure.test.model.definition

import javax.json.JsonObject
import kotlin.collections.List

interface UploadAttachmentsRequest {
  val attachments: List<HttpPostedTcmAttachment>

  val requestParams: JsonObject
}
