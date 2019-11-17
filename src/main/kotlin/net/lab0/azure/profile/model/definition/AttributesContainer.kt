package net.lab0.azure.profile.model.definition

import javax.json.JsonObject
import kotlin.Int
import kotlin.String

interface AttributesContainer {
  val attributes: JsonObject

  val containerName: String

  val revision: Int
}
