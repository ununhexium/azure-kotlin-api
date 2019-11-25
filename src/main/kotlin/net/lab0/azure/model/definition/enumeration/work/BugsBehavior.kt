package net.lab0.azure.model.definition.enumeration.work

import com.squareup.moshi.Json

/**
 * Bugs behavior
 */
enum class BugsBehavior {
  @Json(name = "off")
  OFF,

  @Json(name = "asRequirements")
  AS_REQUIREMENTS,

  @Json(name = "asTasks")
  AS_TASKS
}
