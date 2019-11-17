package net.lab0.azure.core.model.definition

import javax.json.JsonObject
import kotlin.String

/**
 * A named value associated with a project.
 */
interface ProjectProperty {
  /**
   * The name of the property.
   */
  val name: String

  /**
   * The value of the property.
   */
  val value: JsonObject
}
