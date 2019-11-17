package net.lab0.azure.test.model.definition

import javax.json.JsonObject

interface TestExtensionField {
  val field: TestExtensionFieldDetails

  val value: JsonObject
}
