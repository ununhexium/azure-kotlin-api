package net.lab0.azure.model.definition.tfvc

import javax.json.JsonObject

/**
 * The class to represent a collection of REST reference links.
 */
interface ReferenceLinks {
  /**
   * The readonly view of the links.  Because Reference links are readonly, we only want to expose
   * them as read only.
   */
  val links: JsonObject
}
