package net.lab0.azure.model.definition.release

import kotlin.Int
import kotlin.String

interface ReleaseDefinitionShallowReference {
  val _links: ReferenceLinks

  /**
   * Gets the unique identifier of release definition.
   */
  val id: Int

  /**
   * Gets or sets the name of the release definition.
   */
  val name: String

  /**
   * Gets or sets the path of the release definition.
   */
  val path: String

  val projectReference: ProjectReference

  /**
   * Gets the REST API url to access the release definition.
   */
  val url: String
}
