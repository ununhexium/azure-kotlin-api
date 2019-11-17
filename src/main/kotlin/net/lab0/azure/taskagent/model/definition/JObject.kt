package net.lab0.azure.taskagent.model.definition

import kotlin.String

interface JObject {
  val item: JToken

  val type: String
}
