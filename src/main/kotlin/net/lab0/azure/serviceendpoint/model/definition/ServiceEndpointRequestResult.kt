package net.lab0.azure.serviceendpoint.model.definition

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.String
import net.lab0.azure.serviceendpoint.model.definition.enumeration.HttpStatusCode

/**
 * Represents result of the service endpoint request.
 */
interface ServiceEndpointRequestResult {
  /**
   * Gets or sets the parameters used to make subsequent calls to the data source
   */
  val callbackContextParameters: JsonObject

  /**
   * Gets or sets the flat that decides if another call to the data source is to be made
   */
  val callbackRequired: Boolean

  /**
   * Gets or sets the error message of the service endpoint request result.
   */
  val errorMessage: String

  val result: JToken

  /**
   * Gets or sets the status code of the service endpoint request result.
   */
  val statusCode: HttpStatusCode
}
