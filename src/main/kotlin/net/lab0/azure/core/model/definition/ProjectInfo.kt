package net.lab0.azure.core.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.core.model.definition.enumeration.ProjectState
import net.lab0.azure.core.model.definition.enumeration.ProjectVisibility

/**
 * Contains information describing a project.
 */
interface ProjectInfo {
  /**
   * The abbreviated name of the project.
   */
  val abbreviation: String

  /**
   * The description of the project.
   */
  val description: String

  /**
   * The id of the project.
   */
  val id: String

  /**
   * The time that this project was last updated.
   */
  val lastUpdateTime: String

  /**
   * The name of the project.
   */
  val name: String

  /**
   * A set of name-value pairs storing additional property data related to the project.
   */
  val properties: List<ProjectProperty>

  /**
   * The current revision of the project.
   */
  val revision: Int

  /**
   * The current state of the project.
   */
  val state: ProjectState

  /**
   * A Uri that can be used to refer to this project.
   */
  val uri: String

  /**
   * The version number of the project.
   */
  val version: Int

  /**
   * Indicates whom the project is visible to.
   */
  val visibility: ProjectVisibility
}
