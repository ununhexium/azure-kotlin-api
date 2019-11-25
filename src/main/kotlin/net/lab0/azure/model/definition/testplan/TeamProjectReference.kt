package net.lab0.azure.model.definition.testplan

import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.testplan.ProjectState
import net.lab0.azure.model.definition.enumeration.testplan.ProjectVisibility

/**
 * Represents a shallow reference to a TeamProject.
 */
interface TeamProjectReference {
  /**
   * Project abbreviation.
   */
  val abbreviation: String

  /**
   * Url to default team identity image.
   */
  val defaultTeamImageUrl: String

  /**
   * The project's description (if any).
   */
  val description: String

  /**
   * Project identifier.
   */
  val id: String

  /**
   * Project name.
   */
  val name: String

  /**
   * Project revision.
   */
  val revision: Int

  /**
   * Project state.
   */
  val state: ProjectState

  /**
   * Url to the full version of the object.
   */
  val url: String

  /**
   * Project visibility.
   */
  val visibility: ProjectVisibility
}
