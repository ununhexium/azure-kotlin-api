package net.lab0.azure.model.definition.enumeration.workitemtracking

import com.squareup.moshi.Json

enum class GetFieldsExpand {
  /**
   * Default behavior.
   */
  @Json(name = "none")
  NONE,

  /**
   * Adds extension fields to the response.
   */
  @Json(name = "extensionFields")
  EXTENSION_FIELDS
}
