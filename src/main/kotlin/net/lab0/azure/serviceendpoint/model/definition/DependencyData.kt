package net.lab0.azure.serviceendpoint.model.definition

import javax.json.JsonObject
import kotlin.String
import kotlin.collections.List

interface DependencyData {
  val input: String

  val map: List<JsonObject>
}
