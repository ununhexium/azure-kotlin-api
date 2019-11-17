package net.lab0.azure.cloudloadtest.model.definition

import javax.json.JsonNumber

interface WebInstanceSummaryData {
  val average: JsonNumber

  val max: JsonNumber

  val min: JsonNumber
}
