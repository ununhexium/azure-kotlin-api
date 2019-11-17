package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.collections.List

interface DownloadAttachmentsRequest {
  val ids: List<Int>

  val lengths: List<Int>
}
