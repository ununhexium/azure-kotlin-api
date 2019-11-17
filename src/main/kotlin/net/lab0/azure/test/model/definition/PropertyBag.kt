package net.lab0.azure.test.model.definition

import javax.json.JsonObject

interface PropertyBag {
  /**
   * Generic store for test session data
   */
  val bag: JsonObject
}
