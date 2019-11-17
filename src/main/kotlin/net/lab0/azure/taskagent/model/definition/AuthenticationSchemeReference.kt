package net.lab0.azure.taskagent.model.definition

import javax.json.JsonObject
import kotlin.String

interface AuthenticationSchemeReference {
  val inputs: JsonObject

  val type: String
}
