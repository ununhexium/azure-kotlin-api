package net.lab0.azure.model.definition.cloudloadtest

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface Type {
  val count: Int

  val occurrences: Int

  val subTypes: List<SubType>

  val typeName: String

  val url: String
}
