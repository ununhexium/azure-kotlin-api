package net.lab0.azure.model.definition.notification

import javax.json.JsonObject
import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface ProcessedEvent {
  /**
   * All of the users that were associtated with this event and their role.
   */
  val actors: List<EventActor>

  val allowedChannels: String

  val artifactUri: String

  val deliveryIdentities: ProcessingIdentities

  /**
   * Evaluations for each user
   */
  val evaluations: JsonObject

  val eventId: Int

  /**
   * Which members were excluded from evaluation (only applies to ActorMatcher subscriptions)
   */
  val exclusions: List<EventActor>

  /**
   * Which members were included for evaluation (only applies to ActorMatcher subscriptions)
   */
  val inclusions: List<EventActor>

  val notifications: List<GeneratedNotification>
}
