package net.lab0.azure.model.definition.work

import javax.json.JsonObject

interface BoardChart : BoardChartReference {
  val _links: ReferenceLinks

  /**
   * The settings for the resource
   */
  val settings: JsonObject
}
