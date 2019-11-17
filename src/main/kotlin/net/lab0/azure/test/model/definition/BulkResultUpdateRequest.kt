package net.lab0.azure.test.model.definition

import kotlin.String
import kotlin.collections.List

interface BulkResultUpdateRequest {
  val projectName: String

  val requests: List<ResultUpdateRequest>
}
