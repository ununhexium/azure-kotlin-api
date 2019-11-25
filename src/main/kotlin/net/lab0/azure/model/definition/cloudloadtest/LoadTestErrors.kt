package net.lab0.azure.model.definition.cloudloadtest

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface LoadTestErrors {
  val count: Int

  val occurrences: Int

  val types: List<Type>

  val url: String
}
