package net.lab0.azure.model.definition.enumeration.memberentitlementmanagement

import com.squareup.moshi.Json

/**
 * Assignment Source of the License (e.g. Group, Unknown etc.
 */
enum class AssignmentSource {
  @Json(name = "none")
  NONE,

  @Json(name = "unknown")
  UNKNOWN,

  @Json(name = "groupRule")
  GROUP_RULE
}
