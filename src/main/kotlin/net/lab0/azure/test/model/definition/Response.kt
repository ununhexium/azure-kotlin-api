package net.lab0.azure.test.model.definition

import kotlin.String
import net.lab0.azure.test.model.definition.enumeration.HttpStatusCode

interface Response {
  val error: String

  val id: String

  val status: HttpStatusCode

  val url: String
}
