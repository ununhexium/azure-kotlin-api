package net.lab0.azure.servicehooks.model.definition

import kotlin.Boolean
import kotlin.String

/**
 * Describes how to configure a subscription that is managed externally.
 */
interface ExternalConfigurationDescriptor {
  /**
   * Url of the site to create this type of subscription.
   */
  val createSubscriptionUrl: String

  /**
   * The name of an input property that contains the URL to edit a subscription.
   */
  val editSubscriptionPropertyName: String

  /**
   * True if the external configuration applies only to hosted.
   */
  val hostedOnly: Boolean
}
