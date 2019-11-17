package net.lab0.azure.taskagent.model.definition

import javax.json.JsonObject
import kotlin.String

interface TaskReference {
  val id: String

  val inputs: JsonObject

  val name: String

  val version: String
}
