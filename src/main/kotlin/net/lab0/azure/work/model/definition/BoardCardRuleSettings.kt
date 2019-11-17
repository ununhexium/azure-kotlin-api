package net.lab0.azure.work.model.definition

import javax.json.JsonObject
import kotlin.String

interface BoardCardRuleSettings {
  val _links: ReferenceLinks

  val rules: JsonObject

  val url: String
}
