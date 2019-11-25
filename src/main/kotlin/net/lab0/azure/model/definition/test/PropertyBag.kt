package net.lab0.azure.model.definition.test

import javax.json.JsonObject

interface PropertyBag {
  /**
   * Generic store for test session data
   */
  val bag: JsonObject
}
