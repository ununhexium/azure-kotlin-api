package net.lab0.azure.workitemtracking.model.definition

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

interface StreamedBatch {
  val continuationToken: String

  val isLastBatch: Boolean

  val nextLink: String

  val values: List<String>
}
