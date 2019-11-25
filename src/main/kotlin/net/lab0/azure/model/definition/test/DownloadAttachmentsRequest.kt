package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.collections.List

interface DownloadAttachmentsRequest {
  val ids: List<Int>

  val lengths: List<Int>
}
