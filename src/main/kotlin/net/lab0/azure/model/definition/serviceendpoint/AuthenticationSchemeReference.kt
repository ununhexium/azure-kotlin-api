package net.lab0.azure.model.definition.serviceendpoint

import javax.json.JsonObject
import kotlin.String

interface AuthenticationSchemeReference {
  val inputs: JsonObject

  val type: String
}
