package net.lab0.azure.model.definition.search

import kotlin.String
import kotlin.collections.List

/**
 * Defines the matched terms in the field of the work item result.
 */
interface WorkItemHit {
  /**
   * Reference name of the highlighted field.
   */
  val fieldReferenceName: String

  /**
   * Matched/highlighted snippets of the field.
   */
  val highlights: List<String>
}
