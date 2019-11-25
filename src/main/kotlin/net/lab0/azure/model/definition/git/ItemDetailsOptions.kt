package net.lab0.azure.model.definition.git

import kotlin.Boolean
import net.lab0.azure.model.definition.enumeration.git.VersionControlRecursionType

/**
 * Optional details to include when returning an item model
 */
interface ItemDetailsOptions {
  /**
   * If true, include metadata about the file type
   */
  val includeContentMetadata: Boolean

  /**
   * Specifies whether to include children (OneLevel), all descendants (Full) or None for folder
   * items
   */
  val recursionLevel: VersionControlRecursionType
}
