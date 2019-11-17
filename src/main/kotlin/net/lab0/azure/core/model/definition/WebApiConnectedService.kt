package net.lab0.azure.core.model.definition

import kotlin.String

interface WebApiConnectedService : WebApiConnectedServiceRef {
  val authenticatedBy: IdentityRef

  /**
   * Extra description on the service.
   */
  val description: String

  /**
   * Friendly Name of service connection
   */
  val friendlyName: String

  /**
   * Id/Name of the connection service. For Ex: Subscription Id for Azure Connection
   */
  override val id: String

  /**
   * The kind of service.
   */
  val kind: String

  val project: TeamProjectReference

  /**
   * Optional uri to connect directly to the service such as https://windows.azure.com
   */
  val serviceUri: String
}
