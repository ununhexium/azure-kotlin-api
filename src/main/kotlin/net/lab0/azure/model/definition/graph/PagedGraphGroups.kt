package net.lab0.azure.model.definition.graph

import kotlin.String
import kotlin.collections.List

interface PagedGraphGroups {
  /**
   * This will be non-null if there is another page of data. There will never be more than one
   * continuation token returned by a request.
   */
  val continuationToken: List<String>

  /**
   * The enumerable list of groups found within a page.
   */
  val graphGroups: List<GraphGroup>
}
