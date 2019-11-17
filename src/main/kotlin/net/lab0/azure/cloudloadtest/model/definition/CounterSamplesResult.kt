package net.lab0.azure.cloudloadtest.model.definition

import kotlin.Int
import kotlin.collections.List

interface CounterSamplesResult {
  val count: Int

  val maxBatchSize: Int

  val totalSamplesCount: Int

  val values: List<CounterInstanceSamples>
}
