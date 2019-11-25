package net.lab0.azure.model.definition.symbol

import kotlin.String
import net.lab0.azure.model.definition.enumeration.symbol.DebugEntryStatus
import net.lab0.azure.model.definition.enumeration.symbol.DebugInformationLevel

/**
 * A dual-purpose data object, the debug entry is used by the client to publish the symbol file
 * (with file's blob identifier, which can be calculated from VSTS hashing algorithm) or query the file
 * (with a client key). Since the symbol server tries to return a matched symbol file with the richest
 * information level, it may not always point to the same symbol file for different queries with same
 * client key.
 */
interface DebugEntry : ResourceBase {
  val blobDetails: JsonBlobIdentifierWithBlocks

  val blobIdentifier: JsonBlobIdentifier

  /**
   * The URI to get the symbol file. Provided by the server, the URI contains authentication
   * information and is readily accessible by plain HTTP GET request. The client is recommended to
   * retrieve the file as soon as it can since the URI will expire in a short period.
   */
  val blobUri: String

  /**
   * A key the client (debugger, for example) uses to find the debug entry. Note it is not unique
   * for each different symbol file as it does not distinguish between those which only differ by
   * information level.
   */
  val clientKey: String

  /**
   * The information level this debug entry contains.
   */
  val informationLevel: DebugInformationLevel

  /**
   * The identifier of symbol request to which this debug entry belongs.
   */
  val requestId: String

  /**
   * The status of debug entry.
   */
  val status: DebugEntryStatus
}
