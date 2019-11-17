package net.lab0.azure.notification.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Status of the subscription. Typically indicates whether the subscription is enabled or not.
 */
enum class SubscriptionStatus {
  /**
   * Subscription is disabled because it generated a high volume of notifications.
   */
  @Json(name = "jailedByNotificationsVolume")
  JAILED_BY_NOTIFICATIONS_VOLUME,

  /**
   * Subscription is disabled and will be deleted.
   */
  @Json(name = "pendingDeletion")
  PENDING_DELETION,

  /**
   * Subscription is disabled because of an Argument Exception while processing the subscription
   */
  @Json(name = "disabledArgumentException")
  DISABLED_ARGUMENT_EXCEPTION,

  /**
   * Subscription is disabled because the project is invalid
   */
  @Json(name = "disabledProjectInvalid")
  DISABLED_PROJECT_INVALID,

  /**
   * Subscription is disabled because the identity does not have the appropriate permissions
   */
  @Json(name = "disabledMissingPermissions")
  DISABLED_MISSING_PERMISSIONS,

  /**
   * Subscription is disabled service due to failures.
   */
  @Json(name = "disabledFromProbation")
  DISABLED_FROM_PROBATION,

  /**
   * Subscription is disabled because the identity is no longer active
   */
  @Json(name = "disabledInactiveIdentity")
  DISABLED_INACTIVE_IDENTITY,

  /**
   * Subscription is disabled because message queue is not supported.
   */
  @Json(name = "disabledMessageQueueNotSupported")
  DISABLED_MESSAGE_QUEUE_NOT_SUPPORTED,

  /**
   * Subscription is disabled because its subscriber is unknown.
   */
  @Json(name = "disabledMissingIdentity")
  DISABLED_MISSING_IDENTITY,

  /**
   * Subscription is disabled because it has an invalid role expression.
   */
  @Json(name = "disabledInvalidRoleExpression")
  DISABLED_INVALID_ROLE_EXPRESSION,

  /**
   * Subscription is disabled because it has an invalid filter expression.
   */
  @Json(name = "disabledInvalidPathClause")
  DISABLED_INVALID_PATH_CLAUSE,

  /**
   * Subscription is disabled because it is a duplicate of a default subscription.
   */
  @Json(name = "disabledAsDuplicateOfDefault")
  DISABLED_AS_DUPLICATE_OF_DEFAULT,

  /**
   * Subscription is disabled by an administrator, not the subscription's subscriber.
   */
  @Json(name = "disabledByAdmin")
  DISABLED_BY_ADMIN,

  /**
   * Subscription is disabled, typically by the owner of the subscription, and will not produce any
   * notifications.
   */
  @Json(name = "disabled")
  DISABLED,

  /**
   * Subscription is active.
   */
  @Json(name = "enabled")
  ENABLED,

  /**
   * Subscription is active, but is on probation due to failed deliveries or other issues with the
   * subscription.
   */
  @Json(name = "enabledOnProbation")
  ENABLED_ON_PROBATION
}
