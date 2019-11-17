package net.lab0.azure.workitemtracking.model.definition.enumeration

import com.squareup.moshi.Json

enum class GetBehaviorsExpand {
  /**
   * Default none option.
   */
  @Json(name = "none")
  NONE,

  /**
   * This option returns fields associated with a behavior.
   */
  @Json(name = "fields")
  FIELDS,

  /**
   * This option returns fields associated with this behavior and all behaviors from which it
   * inherits.
   */
  @Json(name = "combinedFields")
  COMBINED_FIELDS
}
