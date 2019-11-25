package net.lab0.azure.model.definition.core

import kotlin.String

interface WebApiConnectedServiceDetails : WebApiConnectedServiceRef {
  val connectedServiceMetaData: WebApiConnectedService

  /**
   * Credential info
   */
  val credentialsXml: String

  /**
   * Optional uri to connect directly to the service such as https://windows.azure.com
   */
  val endPoint: String
}
