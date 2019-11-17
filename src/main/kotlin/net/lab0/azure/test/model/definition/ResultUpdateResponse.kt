package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface ResultUpdateResponse {
  val attachmentIds: List<Int>

  val lastUpdated: String

  val lastUpdatedBy: String

  val lastUpdatedByName: String

  val maxReservedSubResultId: Int

  val revision: Int

  val testResultId: Int
}
