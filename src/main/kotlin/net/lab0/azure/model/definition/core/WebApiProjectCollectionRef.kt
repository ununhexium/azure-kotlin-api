package net.lab0.azure.model.definition.core

import kotlin.String

interface WebApiProjectCollectionRef {
  /**
   * Collection Tfs Url (Host Url)
   */
  val collectionUrl: String

  /**
   * Collection Guid
   */
  val id: String

  /**
   * Collection Name
   */
  val name: String

  /**
   * Collection REST Url
   */
  val url: String
}
