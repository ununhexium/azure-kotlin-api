package net.lab0.azure.graph.model.definition

import kotlin.String
import kotlin.collections.List

interface PagedGraphUsers {
  /**
   * This will be non-null if there is another page of data. There will never be more than one
   * continuation token returned by a request.
   */
  val continuationToken: List<String>

  /**
   * The enumerable set of users found within a page.
   */
  val graphUsers: List<GraphUser>
}
