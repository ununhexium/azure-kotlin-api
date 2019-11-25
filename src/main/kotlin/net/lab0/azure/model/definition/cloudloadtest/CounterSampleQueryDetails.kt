package net.lab0.azure.model.definition.cloudloadtest

import kotlin.Int
import kotlin.String

interface CounterSampleQueryDetails {
  val counterInstanceId: String

  val fromInterval: Int

  val toInterval: Int
}
