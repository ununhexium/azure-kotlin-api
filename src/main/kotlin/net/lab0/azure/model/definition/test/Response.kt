package net.lab0.azure.model.definition.test

import kotlin.String
import net.lab0.azure.model.definition.enumeration.test.HttpStatusCode

interface Response {
  val error: String

  val id: String

  val status: HttpStatusCode

  val url: String
}
