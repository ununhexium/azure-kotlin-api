package net.lab0.azure.taskagent.model.definition

import kotlin.String
import net.lab0.azure.taskagent.model.definition.enumeration.HttpStatusCode

interface ServiceEndpointRequestResult {
  val errorMessage: String

  val result: JToken

  val statusCode: HttpStatusCode
}
