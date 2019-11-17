package net.lab0.azure.work.model.definition

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
