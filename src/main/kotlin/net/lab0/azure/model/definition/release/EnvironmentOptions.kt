package net.lab0.azure.model.definition.release

import kotlin.Boolean
import kotlin.Int
import kotlin.String

interface EnvironmentOptions {
  val autoLinkWorkItems: Boolean

  val badgeEnabled: Boolean

  val emailNotificationType: String

  val emailRecipients: String

  val enableAccessToken: Boolean

  val publishDeploymentStatus: Boolean

  val pullRequestDeploymentEnabled: Boolean

  val skipArtifactsDownload: Boolean

  val timeoutInMinutes: Int
}
