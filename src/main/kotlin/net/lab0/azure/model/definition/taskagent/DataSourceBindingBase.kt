package net.lab0.azure.model.definition.taskagent

import javax.json.JsonObject
import kotlin.String
import kotlin.collections.List

/**
 * Represents binding of data source for the service endpoint request.
 */
interface DataSourceBindingBase {
  /**
   * Pagination format supported by this data source(ContinuationToken/SkipTop).
   */
  val callbackContextTemplate: String

  /**
   * Subsequent calls needed?
   */
  val callbackRequiredTemplate: String

  /**
   * Gets or sets the name of the data source.
   */
  val dataSourceName: String

  /**
   * Gets or sets the endpoint Id.
   */
  val endpointId: String

  /**
   * Gets or sets the url of the service endpoint.
   */
  val endpointUrl: String

  /**
   * Gets or sets the authorization headers.
   */
  val headers: List<AuthorizationHeader>

  /**
   * Defines the initial value of the query params
   */
  val initialContextTemplate: String

  /**
   * Gets or sets the parameters for the data source.
   */
  val parameters: JsonObject

  /**
   * Gets or sets the result selector.
   */
  val resultSelector: String

  /**
   * Gets or sets the result template.
   */
  val resultTemplate: String

  /**
   * Gets or sets the target of the data source.
   */
  val target: String
}
