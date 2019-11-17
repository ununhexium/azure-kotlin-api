package net.lab0.azure.tfvc.model.definition

import kotlin.String
import net.lab0.azure.tfvc.model.definition.enumeration.VersionControlChangeType

interface Change {
  /**
   * The type of change that was made to the item.
   */
  val changeType: VersionControlChangeType

  /**
   * Current version.
   */
  val item: String

  val newContent: ItemContent

  /**
   * Path of the item on the server.
   */
  val sourceServerItem: String

  /**
   * URL to retrieve the item.
   */
  val url: String
}
