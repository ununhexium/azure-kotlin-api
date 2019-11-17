package net.lab0.azure.test.model.definition

import javax.json.JsonObject

/**
 * Test point workitem property.
 */
interface PointWorkItemProperty {
  /**
   * key value pair of test point work item property.
   */
  val workItem: JsonObject
}
