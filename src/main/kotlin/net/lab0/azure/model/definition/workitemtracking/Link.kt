package net.lab0.azure.model.definition.workitemtracking

import javax.json.JsonObject
import kotlin.String

/**
 * Link description.
 */
interface Link {
  /**
   * Collection of link attributes.
   */
  val attributes: JsonObject

  /**
   * Relation type.
   */
  val rel: String

  /**
   * Link url.
   */
  val url: String
}
