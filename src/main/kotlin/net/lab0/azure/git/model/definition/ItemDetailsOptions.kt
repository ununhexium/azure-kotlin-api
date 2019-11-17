package net.lab0.azure.git.model.definition

import kotlin.Boolean
import net.lab0.azure.git.model.definition.enumeration.VersionControlRecursionType

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
