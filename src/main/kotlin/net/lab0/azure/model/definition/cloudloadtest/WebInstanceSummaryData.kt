package net.lab0.azure.model.definition.cloudloadtest

import javax.json.JsonNumber

interface WebInstanceSummaryData {
  val average: JsonNumber

  val max: JsonNumber

  val min: JsonNumber
}
