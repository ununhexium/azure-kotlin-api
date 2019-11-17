package net.lab0.azure.test.model.definition

import javax.json.JsonObject
import kotlin.Int

interface TestFieldData {
  val dimensions: JsonObject

  val measure: Int
}
