package net.lab0.azure.servicehooks.model.definition

import kotlin.String

/**
 * The base class for all resource containers, i.e. Account, Collection, Project
 */
interface ResourceContainer {
  /**
   * Gets or sets the container's base URL, i.e. the URL of the host (collection, application, or
   * deploument) containing the container resource.
   */
  val baseUrl: String

  /**
   * Gets or sets the container's specific Id.
   */
  val id: String

  /**
   * Gets or sets the container's name.
   */
  val name: String

  /**
   * Gets or sets the container's REST API URL.
   */
  val url: String
}
