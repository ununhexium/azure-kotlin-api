package net.lab0.azure.model.definition.search

import kotlin.String
import net.lab0.azure.model.definition.enumeration.search.VersionControlType

/**
 * Defines the details of the repository.
 */
interface Repository {
  /**
   * Id of the repository.
   */
  val id: String

  /**
   * Name of the repository.
   */
  val name: String

  /**
   * Version control type of the result file.
   */
  val type: VersionControlType
}
