package net.lab0.azure.model.definition.test

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
