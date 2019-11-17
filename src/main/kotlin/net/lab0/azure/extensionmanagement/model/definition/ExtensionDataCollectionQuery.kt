package net.lab0.azure.extensionmanagement.model.definition

import kotlin.collections.List

/**
 * Represents a query to receive a set of extension data collections
 */
interface ExtensionDataCollectionQuery {
  /**
   * A list of collections to query
   */
  val collections: List<ExtensionDataCollection>
}
