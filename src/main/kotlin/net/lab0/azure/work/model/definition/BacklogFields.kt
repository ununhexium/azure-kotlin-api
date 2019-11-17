package net.lab0.azure.work.model.definition

import javax.json.JsonObject

interface BacklogFields {
  /**
   * Field Type (e.g. Order, Activity) to Field Reference Name map
   */
  val typeFields: JsonObject
}
