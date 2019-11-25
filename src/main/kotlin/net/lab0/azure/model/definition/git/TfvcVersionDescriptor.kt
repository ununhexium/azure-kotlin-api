package net.lab0.azure.model.definition.git

import kotlin.String
import net.lab0.azure.model.definition.enumeration.git.TfvcVersionOption
import net.lab0.azure.model.definition.enumeration.git.TfvcVersionType

/**
 * Version descriptor properties.
 */
interface TfvcVersionDescriptor {
  /**
   * Version object.
   */
  val version: String

  val versionOption: TfvcVersionOption

  val versionType: TfvcVersionType
}
