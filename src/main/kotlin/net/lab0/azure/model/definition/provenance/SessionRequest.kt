package net.lab0.azure.model.definition.provenance

import javax.json.JsonObject
import kotlin.String

interface SessionRequest {
  /**
   * Generic property bag to store data about the session
   */
  val data: JsonObject

  /**
   * The feed name or id for the session
   */
  val feed: String

  /**
   * The type of session If a known value is provided, the Data dictionary will be validated for the
   * presence of properties required by that type
   */
  val source: String
}
