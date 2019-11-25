package net.lab0.azure.model.definition.cloudloadtest

import javax.json.JsonNumber
import kotlin.Int

interface SummaryPercentileData {
  val percentile: Int

  val percentileValue: JsonNumber
}
