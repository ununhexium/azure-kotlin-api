package net.lab0.azure.model.definition.release

import kotlin.String

/**
 * Class to represent favorite entry
 */
interface FavoriteItem {
  /**
   * Application specific data for the entry
   */
  val data: String

  /**
   * Unique Id of the the entry
   */
  val id: String

  /**
   * Display text for favorite entry
   */
  val name: String

  /**
   * Application specific favorite entry type. Empty or Null represents that Favorite item is a
   * Folder
   */
  val type: String
}
