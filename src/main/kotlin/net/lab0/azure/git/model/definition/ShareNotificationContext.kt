package net.lab0.azure.git.model.definition

import kotlin.String
import kotlin.collections.List

/**
 * Context used while sharing a pull request.
 */
interface ShareNotificationContext {
  /**
   * Optional user note or message.
   */
  val message: String

  /**
   * Identities of users who will receive a share notification.
   */
  val receivers: List<IdentityRef>
}
