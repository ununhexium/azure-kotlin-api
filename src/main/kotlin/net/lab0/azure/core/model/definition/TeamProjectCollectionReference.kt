package net.lab0.azure.core.model.definition

import kotlin.String

/**
 * Reference object for a TeamProjectCollection.
 */
interface TeamProjectCollectionReference {
  /**
   * Collection Id.
   */
  val id: String

  /**
   * Collection Name.
   */
  val name: String

  /**
   * Collection REST Url.
   */
  val url: String
}
