package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.collections.List

interface UpdateTestRunResponse {
  val attachmentIds: List<Int>

  val updatedProperties: UpdatedProperties
}
