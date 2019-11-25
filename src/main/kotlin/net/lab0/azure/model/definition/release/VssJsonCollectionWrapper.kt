package net.lab0.azure.model.definition.release

import kotlin.String

/**
 * This class is used to serialized collections as a single JSON object on the wire, to avoid
 * serializing JSON arrays directly to the client, which can be a security hole
 */
interface VssJsonCollectionWrapper : VssJsonCollectionWrapperBase {
  val value: String
}
