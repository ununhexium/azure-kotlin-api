package net.lab0.azure.model.definition.taskagent

import javax.json.JsonObject
import kotlin.String

interface TaskReference {
  val id: String

  val inputs: JsonObject

  val name: String

  val version: String
}
