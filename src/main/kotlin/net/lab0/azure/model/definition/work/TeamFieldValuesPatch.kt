package net.lab0.azure.model.definition.work

import kotlin.String
import kotlin.collections.List

/**
 * Expected data from PATCH
 */
interface TeamFieldValuesPatch {
  val defaultValue: String

  val values: List<TeamFieldValue>
}
