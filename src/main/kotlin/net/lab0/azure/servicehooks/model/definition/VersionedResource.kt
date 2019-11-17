package net.lab0.azure.servicehooks.model.definition

import javax.json.JsonObject
import kotlin.String

/**
 * Encapsulates the resource version and its data or reference to the compatible version. Only one
 * of the two last fields should be not null.
 */
interface VersionedResource {
  /**
   * Gets or sets the reference to the compatible version.
   */
  val compatibleWith: String

  /**
   * Gets or sets the resource data.
   */
  val resource: JsonObject

  /**
   * Gets or sets the version of the resource data.
   */
  val resourceVersion: String
}
