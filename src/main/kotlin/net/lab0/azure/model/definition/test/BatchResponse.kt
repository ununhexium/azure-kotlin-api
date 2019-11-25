package net.lab0.azure.model.definition.test

import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.test.HttpStatusCode

interface BatchResponse {
  val error: String

  val responses: List<Response>

  val status: HttpStatusCode
}
