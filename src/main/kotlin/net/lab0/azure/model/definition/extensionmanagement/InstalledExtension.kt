package net.lab0.azure.model.definition.extensionmanagement

import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.extensionmanagement.ExtensionFlags

/**
 * Represents a VSTS extension along with its installation state
 */
interface InstalledExtension : ExtensionManifest {
  /**
   * The friendly extension id for this extension - unique for a given publisher.
   */
  val extensionId: String

  /**
   * The display name of the extension.
   */
  val extensionName: String

  /**
   * This is the set of files available from the extension.
   */
  val files: List<ExtensionFile>

  /**
   * Extension flags relevant to contribution consumers
   */
  val flags: ExtensionFlags

  val installState: InstalledExtensionState

  /**
   * This represents the date/time the extensions was last updated in the gallery. This doesnt mean
   * this version was updated the value represents changes to any and all versions of the extension.
   */
  val lastPublished: String

  /**
   * Unique id of the publisher of this extension
   */
  val publisherId: String

  /**
   * The display name of the publisher
   */
  val publisherName: String

  /**
   * Unique id for this extension (the same id is used for all versions of a single extension)
   */
  val registrationId: String

  /**
   * Version of this extension
   */
  val version: String
}
