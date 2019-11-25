package net.lab0.azure.model.definition.taskagent

import kotlin.String
import net.lab0.azure.model.definition.enumeration.taskagent.HttpStatusCode

interface ServiceEndpointRequestResult {
  val errorMessage: String

  val result: JToken

  val statusCode: HttpStatusCode
}
