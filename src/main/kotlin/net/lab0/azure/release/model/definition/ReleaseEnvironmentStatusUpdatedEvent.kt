package net.lab0.azure.release.model.definition

import kotlin.Int
import net.lab0.azure.release.model.definition.enumeration.DeploymentOperationStatus
import net.lab0.azure.release.model.definition.enumeration.DeploymentStatus
import net.lab0.azure.release.model.definition.enumeration.EnvironmentStatus

interface ReleaseEnvironmentStatusUpdatedEvent : RealtimeReleaseDefinitionEvent {
  val environmentId: Int

  val environmentStatus: EnvironmentStatus

  val latestDeploymentOperationStatus: DeploymentOperationStatus

  val latestDeploymentStatus: DeploymentStatus

  val releaseId: Int
}
