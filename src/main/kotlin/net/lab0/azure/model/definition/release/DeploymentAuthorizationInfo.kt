package net.lab0.azure.model.definition.release

import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.release.AuthorizationHeaderFor

interface DeploymentAuthorizationInfo {
  val authorizationHeaderFor: AuthorizationHeaderFor

  val resources: List<String>

  val tenantId: String

  val vstsAccessTokenKey: String
}
