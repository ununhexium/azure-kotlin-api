package net.lab0.azure.extensionmanagement.model.definition

import javax.json.JsonObject

/**
 * Contextual information that data providers can examine when populating their data
 */
interface DataProviderContext {
  /**
   * Generic property bag that contains context-specific properties that data providers can use when
   * populating their data dictionary
   */
  val properties: JsonObject
}
