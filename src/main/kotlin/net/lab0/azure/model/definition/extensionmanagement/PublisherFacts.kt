package net.lab0.azure.model.definition.extensionmanagement

import kotlin.String
import net.lab0.azure.model.definition.enumeration.extensionmanagement.PublisherFlags

/**
 * High-level information about the publisher, like id's and names
 */
interface PublisherFacts {
  val displayName: String

  val flags: PublisherFlags

  val publisherId: String

  val publisherName: String
}
