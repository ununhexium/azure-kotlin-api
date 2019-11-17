package net.lab0.azure.notification.model.definition

import javax.json.JsonObject
import kotlin.String

interface MatcherResult {
  val matcher: String

  val stats: JsonObject
}
