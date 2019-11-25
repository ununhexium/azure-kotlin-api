package net.lab0.azure.model.definition.notification

import javax.json.JsonObject
import kotlin.String

/**
 * A transform request specify the properties of a notification event to be transformed.
 */
interface EventTransformRequest {
  /**
   * Event payload.
   */
  val eventPayload: String

  /**
   * Event type.
   */
  val eventType: String

  /**
   * System inputs.
   */
  val systemInputs: JsonObject
}
