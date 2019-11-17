package net.lab0.azure.extensionmanagement.model.definition

import kotlin.String
import kotlin.collections.List

/**
 * Represents a single collection for extension data documents
 */
interface ExtensionDataCollection {
  /**
   * The name of the collection
   */
  val collectionName: String

  /**
   * A list of documents belonging to the collection
   */
  val documents: List<JObject>

  /**
   * The type of the collection's scope, such as Default or User
   */
  val scopeType: String

  /**
   * The value of the collection's scope, such as Current or Me
   */
  val scopeValue: String
}
