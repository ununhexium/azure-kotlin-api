package net.lab0.azure.model.definition.taskagent

import javax.json.JsonObject
import kotlin.String

interface ServiceEndpointDetails {
  val authorization: EndpointAuthorization

  val data: JsonObject

  val type: String

  val url: String
}
