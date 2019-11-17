package net.lab0.azure.serviceendpoint.model.definition

import javax.json.JsonObject
import kotlin.String
import kotlin.collections.List

/**
 * Represents details of the service endpoint data source.
 */
interface DataSourceDetails {
  /**
   * Gets or sets the data source name.
   */
  val dataSourceName: String

  /**
   * Gets or sets the data source url.
   */
  val dataSourceUrl: String

  /**
   * Gets or sets the request headers.
   */
  val headers: List<AuthorizationHeader>

  /**
   * Gets or sets the initialization context used for the initial call to the data source
   */
  val initialContextTemplate: String

  /**
   * Gets the parameters of data source.
   */
  val parameters: JsonObject

  /**
   * Gets or sets the data source request content.
   */
  val requestContent: String

  /**
   * Gets or sets the data source request verb. Get/Post are the only implemented types
   */
  val requestVerb: String

  /**
   * Gets or sets the resource url of data source.
   */
  val resourceUrl: String

  /**
   * Gets or sets the result selector.
   */
  val resultSelector: String
}
