package net.lab0.azure.model.definition.test

import kotlin.String
import kotlin.collections.List

interface BulkResultUpdateRequest {
  val projectName: String

  val requests: List<ResultUpdateRequest>
}
