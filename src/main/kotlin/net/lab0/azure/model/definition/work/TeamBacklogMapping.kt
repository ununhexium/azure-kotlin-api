package net.lab0.azure.model.definition.work

import kotlin.String

/**
 * Mapping of teams to the corresponding work item category
 */
interface TeamBacklogMapping {
  val categoryReferenceName: String

  val teamId: String
}
