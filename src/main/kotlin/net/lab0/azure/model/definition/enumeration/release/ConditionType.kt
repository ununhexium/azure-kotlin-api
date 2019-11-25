package net.lab0.azure.model.definition.enumeration.release

import com.squareup.moshi.Json

/**
 * Gets or sets the condition type.
 */
enum class ConditionType {
  /**
   * The condition type is undefined.
   */
  @Json(name = "undefined")
  UNDEFINED,

  /**
   * The condition type is event.
   */
  @Json(name = "event")
  EVENT,

  /**
   * The condition type is environment state.
   */
  @Json(name = "environmentState")
  ENVIRONMENT_STATE,

  /**
   * The condition type is artifact.
   */
  @Json(name = "artifact")
  ARTIFACT
}
