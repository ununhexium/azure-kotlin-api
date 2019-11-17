package net.lab0.azure.cloudloadtest.model.definition

import kotlin.Int
import kotlin.String

interface CounterSampleQueryDetails {
  val counterInstanceId: String

  val fromInterval: Int

  val toInterval: Int
}
