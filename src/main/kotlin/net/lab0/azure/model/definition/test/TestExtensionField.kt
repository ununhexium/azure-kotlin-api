package net.lab0.azure.model.definition.test

import javax.json.JsonObject

interface TestExtensionField {
  val field: TestExtensionFieldDetails

  val value: JsonObject
}
