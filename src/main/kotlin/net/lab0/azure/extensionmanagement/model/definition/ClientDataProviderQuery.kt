package net.lab0.azure.extensionmanagement.model.definition

import kotlin.String

/**
 * A client data provider are the details needed to make the data provider request from the client.
 */
interface ClientDataProviderQuery : DataProviderQuery {
  /**
   * The Id of the service instance type that should be communicated with in order to resolve the
   * data providers from the client given the query values.
   */
  val queryServiceInstanceType: String
}
