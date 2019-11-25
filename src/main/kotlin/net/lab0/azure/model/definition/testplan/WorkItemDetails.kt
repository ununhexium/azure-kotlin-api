package net.lab0.azure.model.definition.testplan

import javax.json.JsonObject
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * Work Item Class
 */
interface WorkItemDetails {
  /**
   * Work Item Id
   */
  val id: Int

  /**
   * Work Item Name
   */
  val name: String

  /**
   * Work Item Fields
   */
  val workItemFields: List<JsonObject>
}
