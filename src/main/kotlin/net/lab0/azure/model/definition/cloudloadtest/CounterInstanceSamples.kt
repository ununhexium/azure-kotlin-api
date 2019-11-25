package net.lab0.azure.model.definition.cloudloadtest

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface CounterInstanceSamples {
  val count: Int

  val counterInstanceId: String

  val nextRefreshTime: String

  val values: List<CounterSample>
}
