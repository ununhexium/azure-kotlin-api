package net.lab0.azure.release.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.collections.List

interface DeploymentInput : BaseDeploymentInput {
  val artifactsDownloadInput: ArtifactsDownloadInput

  val demands: List<Demand>

  val enableAccessToken: Boolean

  val queueId: Int

  val skipArtifactsDownload: Boolean
}
