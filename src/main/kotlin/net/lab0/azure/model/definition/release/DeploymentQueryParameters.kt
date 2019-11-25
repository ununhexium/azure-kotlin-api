package net.lab0.azure.model.definition.release

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.release.DeploymentExpands
import net.lab0.azure.model.definition.enumeration.release.DeploymentOperationStatus
import net.lab0.azure.model.definition.enumeration.release.DeploymentStatus
import net.lab0.azure.model.definition.enumeration.release.DeploymentsQueryType

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
