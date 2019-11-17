package net.lab0.azure.release.model.definition

import kotlin.String
import kotlin.collections.List
import net.lab0.azure.release.model.definition.enumeration.AuthorizationHeaderFor

interface DeploymentAuthorizationInfo {
  val authorizationHeaderFor: AuthorizationHeaderFor

  val resources: List<String>

  val tenantId: String

  val vstsAccessTokenKey: String
}
