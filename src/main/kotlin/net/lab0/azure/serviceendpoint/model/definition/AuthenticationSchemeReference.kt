package net.lab0.azure.serviceendpoint.model.definition

import javax.json.JsonObject
import kotlin.String

interface AuthenticationSchemeReference {
  val inputs: JsonObject

  val type: String
}
