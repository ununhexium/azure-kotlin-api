package net.lab0.azure.release.model.definition

import javax.json.JsonObject
import kotlin.String

interface Issue {
  val data: JsonObject

  val issueType: String

  val message: String
}
