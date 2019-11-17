package net.lab0.azure.cloudloadtest.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface CounterInstanceSamples {
  val count: Int

  val counterInstanceId: String

  val nextRefreshTime: String

  val values: List<CounterSample>
}
