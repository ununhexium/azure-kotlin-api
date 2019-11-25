package net.lab0.azure.model.definition.work

import javax.json.JsonObject
import kotlin.String

interface BoardCardRuleSettings {
  val _links: ReferenceLinks

  val rules: JsonObject

  val url: String
}
