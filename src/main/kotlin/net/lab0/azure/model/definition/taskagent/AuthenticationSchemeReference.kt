package net.lab0.azure.model.definition.taskagent

import javax.json.JsonObject
import kotlin.String

interface AuthenticationSchemeReference {
  val inputs: JsonObject

  val type: String
}
