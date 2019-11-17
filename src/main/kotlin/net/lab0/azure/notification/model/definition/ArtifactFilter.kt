package net.lab0.azure.notification.model.definition

import kotlin.String

/**
 * Artifact filter options. Used in "follow" subscriptions.
 */
interface ArtifactFilter : BaseSubscriptionFilter {
  val artifactId: String

  val artifactType: String

  val artifactUri: String

  override val type: String
}
