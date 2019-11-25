package net.lab0.azure.model.definition.release

import kotlin.Int
import kotlin.String

interface ReleaseEnvironmentShallowReference {
  val _links: ReferenceLinks

  /**
   * Gets the unique identifier of release environment.
   */
  val id: Int

  /**
   * Gets or sets the name of the release environment.
   */
  val name: String

  /**
   * Gets the REST API url to access the release environment.
   */
  val url: String
}
