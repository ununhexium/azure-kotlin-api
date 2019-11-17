package net.lab0.azure.taskagent.model.definition

import kotlin.String
import kotlin.collections.List

/**
 * Represents type of the service endpoint.
 */
interface ServiceEndpointType {
  /**
   * Authentication scheme of service endpoint type.
   */
  val authenticationSchemes: List<ServiceEndpointAuthenticationScheme>

  /**
   * Data sources of service endpoint type.
   */
  val dataSources: List<DataSource>

  /**
   * Dependency data of service endpoint type.
   */
  val dependencyData: List<DependencyData>

  /**
   * Gets or sets the description of service endpoint type.
   */
  val description: String

  /**
   * Gets or sets the display name of service endpoint type.
   */
  val displayName: String

  val endpointUrl: EndpointUrl

  val helpLink: HelpLink

  val helpMarkDown: String

  /**
   * Gets or sets the icon url of service endpoint type.
   */
  val iconUrl: String

  /**
   * Input descriptor of service endpoint type.
   */
  val inputDescriptors: List<InputDescriptor>

  /**
   * Gets or sets the name of service endpoint type.
   */
  val name: String

  /**
   * Trusted hosts of a service endpoint type.
   */
  val trustedHosts: List<String>

  /**
   * Gets or sets the ui contribution id of service endpoint type.
   */
  val uiContributionId: String
}
