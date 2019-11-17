package net.lab0.azure.cloudloadtest.model.definition

import javax.json.JsonObject
import kotlin.String

interface CltCustomerIntelligenceData {
  val area: String

  val feature: String

  val properties: JsonObject
}
