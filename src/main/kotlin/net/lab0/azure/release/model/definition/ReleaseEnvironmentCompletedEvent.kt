package net.lab0.azure.release.model.definition

import kotlin.Int
import kotlin.String
import net.lab0.azure.release.model.definition.enumeration.DeploymentReason

interface ReleaseEnvironmentCompletedEvent {
  val createdByName: String

  val definitionId: Int

  val definitionName: String

  val environment: ReleaseEnvironment

  val environmentId: Int

  val projectName: String

  val reason: DeploymentReason

  val releaseCreatedBy: IdentityRef

  val releaseLogsUri: String

  val releaseName: String

  val status: String

  val title: String

  val webAccessUri: String
}
