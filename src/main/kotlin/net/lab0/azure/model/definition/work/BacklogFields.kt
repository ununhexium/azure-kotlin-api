package net.lab0.azure.model.definition.work

import javax.json.JsonObject

interface BacklogFields {
  /**
   * Field Type (e.g. Order, Activity) to Field Reference Name map
   */
  val typeFields: JsonObject
}
