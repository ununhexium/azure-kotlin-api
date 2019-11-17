package net.lab0.azure.work.model.definition

import javax.json.JsonObject

interface BoardChart : BoardChartReference {
  val _links: ReferenceLinks

  /**
   * The settings for the resource
   */
  val settings: JsonObject
}
