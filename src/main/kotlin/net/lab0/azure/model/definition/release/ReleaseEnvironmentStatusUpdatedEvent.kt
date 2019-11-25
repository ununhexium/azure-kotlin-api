package net.lab0.azure.model.definition.release

import kotlin.Int
import net.lab0.azure.model.definition.enumeration.release.DeploymentOperationStatus
import net.lab0.azure.model.definition.enumeration.release.DeploymentStatus
import net.lab0.azure.model.definition.enumeration.release.EnvironmentStatus

interface ReleaseEnvironmentStatusUpdatedEvent : RealtimeReleaseDefinitionEvent {
  val environmentId: Int

  val environmentStatus: EnvironmentStatus

  val latestDeploymentOperationStatus: DeploymentOperationStatus

  val latestDeploymentStatus: DeploymentStatus

  val releaseId: Int
}
