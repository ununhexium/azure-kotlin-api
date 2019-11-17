package net.lab0.azure.wiki.model.definition

import kotlin.String
import net.lab0.azure.wiki.model.definition.enumeration.WikiType

/**
 * Base wiki creation parameters.
 */
interface WikiCreateBaseParameters {
  /**
   * Folder path inside repository which is shown as Wiki. Not required for ProjectWiki type.
   */
  val mappedPath: String

  /**
   * Wiki name.
   */
  val name: String

  /**
   * ID of the project in which the wiki is to be created.
   */
  val projectId: String

  /**
   * ID of the git repository that backs up the wiki. Not required for ProjectWiki type.
   */
  val repositoryId: String

  /**
   * Type of the wiki.
   */
  val type: WikiType
}
