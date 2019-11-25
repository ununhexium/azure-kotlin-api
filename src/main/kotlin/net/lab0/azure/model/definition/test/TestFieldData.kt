package net.lab0.azure.model.definition.test

import javax.json.JsonObject
import kotlin.Int

interface TestFieldData {
  val dimensions: JsonObject

  val measure: Int
}
