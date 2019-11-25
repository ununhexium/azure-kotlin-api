package net.lab0.azure.model.definition.work

import javax.json.JsonObject
import kotlin.String

interface WorkItemTypeStateInfo {
  /**
   * State name to state category map
   */
  val states: JsonObject

  /**
   * Work Item type name
   */
  val workItemTypeName: String
}
