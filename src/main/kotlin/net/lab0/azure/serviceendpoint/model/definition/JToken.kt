package net.lab0.azure.serviceendpoint.model.definition

import kotlin.Boolean
import kotlin.String

interface JToken {
  val first: JToken

  val hasValues: Boolean

  val item: JToken

  val last: JToken

  val next: JToken

  val parent: String

  val path: String

  val previous: JToken

  val root: JToken

  val type: String
}
