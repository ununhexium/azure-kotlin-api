package net.lab0.azure.model.definition.cloudloadtest

import kotlin.Int
import kotlin.collections.List

interface CounterSamplesResult {
  val count: Int

  val maxBatchSize: Int

  val totalSamplesCount: Int

  val values: List<CounterInstanceSamples>
}
