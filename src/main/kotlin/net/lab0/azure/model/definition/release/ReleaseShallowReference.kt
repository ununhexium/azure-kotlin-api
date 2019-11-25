package net.lab0.azure.model.definition.release

import kotlin.Int
import kotlin.String

interface ReleaseShallowReference {
  val _links: ReferenceLinks

  /**
   * Gets the unique identifier of release.
   */
  val id: Int

  /**
   * Gets or sets the name of the release.
   */
  val name: String

  /**
   * Gets the REST API url to access the release.
   */
  val url: String
}
