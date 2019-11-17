package net.lab0.azure.work.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * The type of this backlog level
 */
enum class BacklogType {
  /**
   * Portfolio backlog level
   */
  @Json(name = "portfolio")
  PORTFOLIO,

  /**
   * Requirement backlog level
   */
  @Json(name = "requirement")
  REQUIREMENT,

  /**
   * Task backlog level
   */
  @Json(name = "task")
  TASK
}
