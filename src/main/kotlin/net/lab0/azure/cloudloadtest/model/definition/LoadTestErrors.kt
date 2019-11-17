package net.lab0.azure.cloudloadtest.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface LoadTestErrors {
  val count: Int

  val occurrences: Int

  val types: List<Type>

  val url: String
}
