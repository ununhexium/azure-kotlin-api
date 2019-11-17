package net.lab0.azure.release.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.release.model.definition.enumeration.DeploymentExpands
import net.lab0.azure.release.model.definition.enumeration.DeploymentOperationStatus
import net.lab0.azure.release.model.definition.enumeration.DeploymentStatus
import net.lab0.azure.release.model.definition.enumeration.DeploymentsQueryType

interface DeploymentQueryParameters {
  val artifactSourceId: String

  val artifactTypeId: String

  val artifactVersions: List<String>

  val deploymentsPerEnvironment: Int

  val deploymentStatus: DeploymentStatus

  val environments: List<DefinitionEnvironmentReference>

  val expands: DeploymentExpands

  val isDeleted: Boolean

  val operationStatus: DeploymentOperationStatus

  val queryType: DeploymentsQueryType

  val sourceBranch: String
}
