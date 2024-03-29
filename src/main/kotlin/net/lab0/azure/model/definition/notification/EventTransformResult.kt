package net.lab0.azure.model.definition.notification

import javax.json.JsonObject
import kotlin.String

/**
 * Result of transforming a notification event.
 */
interface EventTransformResult {
  /**
   * Transformed html content.
   */
  val content: String

  /**
   * Calculated data.
   */
  val data: JsonObject

  /**
   * Calculated system inputs.
   */
  val systemInputs: JsonObject
}
