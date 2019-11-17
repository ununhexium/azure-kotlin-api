package net.lab0.azure.test.model.definition

import kotlin.String
import kotlin.collections.List
import net.lab0.azure.test.model.definition.enumeration.HttpStatusCode

interface BatchResponse {
  val error: String

  val responses: List<Response>

  val status: HttpStatusCode
}
