package net.lab0.azure.core.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Indicates whom the project is visible to.
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
