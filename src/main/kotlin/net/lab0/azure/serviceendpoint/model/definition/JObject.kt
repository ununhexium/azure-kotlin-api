package net.lab0.azure.serviceendpoint.model.definition

import kotlin.String

interface JObject {
  val item: JToken

  val type: String
}
