package net.lab0.azure.model.definition.serviceendpoint

import kotlin.String

interface OAuthConfiguration {
  /**
   * Gets or sets the ClientId
   */
  val clientId: String

  /**
   * Gets or sets the ClientSecret
   */
  val clientSecret: String

  val createdBy: IdentityRef

  /**
   * Gets or sets the time when config was created.
   */
  val createdOn: String

  /**
   * Gets or sets the type of the endpoint.
   */
  val endpointType: String

  /**
   * Gets or sets the unique identifier of this field
   */
  val id: String

  val modifiedBy: IdentityRef

  /**
   * Gets or sets the time when variable group was modified
   */
  val modifiedOn: String

  /**
   * Gets or sets the name
   */
  val name: String

  /**
   * Gets or sets the Url
   */
  val url: String
}
