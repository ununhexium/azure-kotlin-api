package net.lab0.azure.model.definition.cloudloadtest

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface SubType {
  val count: Int

  val errorDetailList: List<ErrorDetails>

  val occurrences: Int

  val subTypeName: String

  val url: String
}
