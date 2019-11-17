package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.collections.List

interface UpdateTestRunResponse {
  val attachmentIds: List<Int>

  val updatedProperties: UpdatedProperties
}
