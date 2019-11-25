package net.lab0.azure.model.definition.extensionmanagement

import kotlin.String

/**
 * Represents the component pieces of an extensions fully qualified name, along with the fully
 * qualified name.
 */
interface ExtensionIdentifier {
  /**
   * The ExtensionName component part of the fully qualified ExtensionIdentifier
   */
  val extensionName: String

  /**
   * The PublisherName component part of the fully qualified ExtensionIdentifier
   */
  val publisherName: String
}
