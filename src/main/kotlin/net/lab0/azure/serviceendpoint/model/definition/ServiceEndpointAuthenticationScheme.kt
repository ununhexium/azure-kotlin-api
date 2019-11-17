package net.lab0.azure.serviceendpoint.model.definition

import kotlin.String
import kotlin.collections.List

interface ServiceEndpointAuthenticationScheme {
  /**
   * Gets or sets the authorization headers of service endpoint authentication scheme.
   */
  val authorizationHeaders: List<AuthorizationHeader>

  /**
   * Gets or sets the Authorization url required to authenticate using OAuth2
   */
  val authorizationUrl: String

  /**
   * Gets or sets the certificates of service endpoint authentication scheme.
   */
  val clientCertificates: List<ClientCertificate>

  val dataSourceBindings: List<DataSourceBinding>

  /**
   * Gets or sets the display name for the service endpoint authentication scheme.
   */
  val displayName: String

  /**
   * Gets or sets the input descriptors for the service endpoint authentication scheme.
   */
  val inputDescriptors: List<InputDescriptor>

  /**
   * Gets or sets the scheme for service endpoint authentication.
   */
  val scheme: String
}
