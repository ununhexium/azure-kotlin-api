package net.lab0.azure.cloudloadtest.model.definition

import javax.json.JsonNumber
import kotlin.Int

interface SummaryPercentileData {
  val percentile: Int

  val percentileValue: JsonNumber
}
