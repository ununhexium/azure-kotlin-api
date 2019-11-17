package net.lab0.azure.workitemtracking.model.definition

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
