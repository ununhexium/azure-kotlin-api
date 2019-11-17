package net.lab0.azure.work.model.definition

import kotlin.String

/**
 * Mapping of teams to the corresponding work item category
 */
interface TeamBacklogMapping {
  val categoryReferenceName: String

  val teamId: String
}
