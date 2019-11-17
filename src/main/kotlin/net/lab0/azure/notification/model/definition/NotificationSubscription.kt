package net.lab0.azure.notification.model.definition

import javax.json.JsonObject
import kotlin.String
import net.lab0.azure.notification.model.definition.enumeration.SubscriptionFlags
import net.lab0.azure.notification.model.definition.enumeration.SubscriptionPermissions
import net.lab0.azure.notification.model.definition.enumeration.SubscriptionStatus

/**
 * A subscription defines criteria for matching events and how the subscription's subscriber should
 * be notified about those events.
 */
interface NotificationSubscription {
  val _links: ReferenceLinks

  val adminSettings: SubscriptionAdminSettings

  val channel: ISubscriptionChannel

  /**
   * Description of the subscription. Typically describes filter criteria which helps identity the
   * subscription.
   */
  val description: String

  val diagnostics: SubscriptionDiagnostics

  /**
   * Any extra properties like detailed description for different contexts, user/group contexts
   */
  val extendedProperties: JsonObject

  val filter: ISubscriptionFilter

  /**
   * Read-only indicators that further describe the subscription.
   */
  val flags: SubscriptionFlags

  /**
   * Subscription identifier.
   */
  val id: String

  val lastModifiedBy: IdentityRef

  /**
   * Date when the subscription was last modified. If the subscription has not been updated since it
   * was created, this value will indicate when the subscription was created.
   */
  val modifiedDate: String

  /**
   * The permissions the user have for this subscriptions.
   */
  val permissions: SubscriptionPermissions

  val scope: SubscriptionScope

  /**
   * Status of the subscription. Typically indicates whether the subscription is enabled or not.
   */
  val status: SubscriptionStatus

  /**
   * Message that provides more details about the status of the subscription.
   */
  val statusMessage: String

  val subscriber: IdentityRef

  /**
   * REST API URL of the subscriotion.
   */
  val url: String

  val userSettings: SubscriptionUserSettings
}
