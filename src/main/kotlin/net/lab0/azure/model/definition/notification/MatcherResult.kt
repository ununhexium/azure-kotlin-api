package net.lab0.azure.model.definition.notification

import javax.json.JsonObject
import kotlin.String

interface MatcherResult {
  val matcher: String

  val stats: JsonObject
}
