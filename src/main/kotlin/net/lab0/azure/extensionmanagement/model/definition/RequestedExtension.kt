package net.lab0.azure.extensionmanagement.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * A request for an extension (to be installed or have a license assigned)
 */
interface RequestedExtension {
  /**
   * The unique name of the extension
   */
  val extensionName: String

  /**
   * A list of each request for the extension
   */
  val extensionRequests: List<ExtensionRequest>

  /**
   * DisplayName of the publisher that owns the extension being published.
   */
  val publisherDisplayName: String

  /**
   * Represents the Publisher of the requested extension
   */
  val publisherName: String

  /**
   * The total number of requests for an extension
   */
  val requestCount: Int
}
