package net.lab0.azure.model.definition.workitemtracking

import kotlin.String

/**
 * A WIQL query
 */
interface Wiql {
  /**
   * The text of the WIQL query
   */
  val query: String
}
