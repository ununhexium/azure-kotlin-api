package net.lab0.azure.model.definition.notification

import javax.json.JsonObject
import kotlin.String
import kotlin.collections.List

/**
 * This is the type used for firing notifications intended for the subsystem in the Notifications
 * SDK. For components that can't take a dependency on the Notifications SDK directly, they can use
 * ITeamFoundationEventService.PublishNotification and the Notifications SDK ISubscriber implementation
 * will get it.
 */
interface VssNotificationEvent {
  /**
   * Optional: A list of actors which are additional identities with corresponding roles that are
   * relevant to the event.
   */
  val actors: List<EventActor>

  /**
   * Optional: A list of artifacts referenced or impacted by this event.
   */
  val artifactUris: List<String>

  /**
   * Required: The event payload.  If Data is a string, it must be in Json or XML format.  Otherwise
   * it must have a serialization format attribute.
   */
  val data: JsonObject

  /**
   * Required: The name of the event.  This event must be registered in the context it is being
   * fired.
   */
  val eventType: String

  /**
   * How long before the event expires and will be cleaned up.  The default is to use the system
   * default.
   */
  val expiresIn: String

  /**
   * The id of the item, artifact, extension, project, etc.
   */
  val itemId: String

  /**
   * How long to wait before processing this event.  The default is to process immediately.
   */
  val processDelay: String

  /**
   * Optional: A list of scopes which are are relevant to the event.
   */
  val scopes: List<EventScope>

  /**
   * This is the time the original source event for this VssNotificationEvent was created.  For
   * example, for something like a build completion notification SourceEventCreatedTime should be the
   * time the build finished not the time this event was raised.
   */
  val sourceEventCreatedTime: String
}
