package net.lab0.azure.model.definition.serviceendpoint

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.String

/**
 * Represents an endpoint which may be used by an orchestration job.
 */
interface ServiceEndpoint {
  val administratorsGroup: IdentityRef

  val authorization: EndpointAuthorization

  val createdBy: IdentityRef

  val data: JsonObject

  /**
   * Gets or sets the description of endpoint.
   */
  val description: String

  val groupScopeId: String

  /**
   * Gets or sets the identifier of this endpoint.
   */
  val id: String

  /**
   * EndPoint state indictor
   */
  val isReady: Boolean

  /**
   * Indicates whether service endpoint is shared with other projects or not.
   */
  val isShared: Boolean

  /**
   * Gets or sets the friendly name of the endpoint.
   */
  val name: String

  val operationStatus: JObject

  /**
   * Owner of the endpoint Supported values are "library", "agentcloud"
   */
  val owner: String

  val readersGroup: IdentityRef

  /**
   * Gets or sets the type of the endpoint.
   */
  val type: String

  /**
   * Gets or sets the url of the endpoint.
   */
  val url: String
}
