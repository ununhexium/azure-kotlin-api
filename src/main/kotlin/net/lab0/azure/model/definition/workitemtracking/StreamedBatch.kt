package net.lab0.azure.model.definition.workitemtracking

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

interface StreamedBatch {
  val continuationToken: String

  val isLastBatch: Boolean

  val nextLink: String

  val values: List<String>
}
