package net.lab0.azure.extensionmanagement.model.definition

import javax.json.JsonObject
import kotlin.String

interface ClientContributionProviderDetails {
  /**
   * Friendly name for the provider.
   */
  val displayName: String

  /**
   * Unique identifier for this provider. The provider name can be used to cache the contribution
   * data and refer back to it when looking for changes
   */
  val name: String

  /**
   * Properties associated with the provider
   */
  val properties: JsonObject

  /**
   * Version of contributions assoicated with this contribution provider.
   */
  val version: String
}
