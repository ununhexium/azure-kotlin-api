package net.lab0.azure.model.definition.enumeration.testplan

import com.squareup.moshi.Json

/**
 * Project visibility.
 */
enum class ProjectVisibility {
  /**
   * The project is only visible to users with explicit access.
   */
  @Json(name = "private")
  PRIVATE,

  /**
   * The project is visible to all.
   */
  @Json(name = "public")
  PUBLIC
}
