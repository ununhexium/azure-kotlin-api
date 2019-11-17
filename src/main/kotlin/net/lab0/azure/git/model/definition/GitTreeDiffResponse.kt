package net.lab0.azure.git.model.definition

import kotlin.String
import kotlin.collections.List

interface GitTreeDiffResponse {
  /**
   * The HTTP client methods find the continuation token header in the response and populate this
   * field.
   */
  val continuationToken: List<String>

  val treeDiff: GitTreeDiff
}
