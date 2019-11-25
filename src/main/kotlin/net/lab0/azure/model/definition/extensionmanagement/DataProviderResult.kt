package net.lab0.azure.model.definition.extensionmanagement

import javax.json.JsonObject
import kotlin.String
import kotlin.collections.List

/**
 * Result structure from calls to GetDataProviderData
 */
interface DataProviderResult {
  /**
   * This is the set of data providers that were requested, but either they were defined as client
   * providers, or as remote providers that failed and may be retried by the client.
   */
  val clientProviders: JsonObject

  /**
   * Property bag of data keyed off of the data provider contribution id
   */
  val data: JsonObject

  /**
   * Set of exceptions that occurred resolving the data providers.
   */
  val exceptions: JsonObject

  /**
   * List of data providers resolved in the data-provider query
   */
  val resolvedProviders: List<ResolvedDataProvider>

  /**
   * Scope name applied to this data provider result.
   */
  val scopeName: String

  /**
   * Scope value applied to this data provider result.
   */
  val scopeValue: String

  /**
   * Property bag of shared data that was contributed to by any of the individual data providers
   */
  val sharedData: JsonObject
}
