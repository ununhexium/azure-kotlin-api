package net.lab0.azure.search.model.definition

import javax.json.JsonObject
import kotlin.String

/**
 * Base class for search request types.
 */
interface EntitySearchRequestBase {
  /**
   * Filters to be applied. Set it to null if there are no filters to be applied.
   */
  val filters: JsonObject

  /**
   * The search text.
   */
  val searchText: String
}
