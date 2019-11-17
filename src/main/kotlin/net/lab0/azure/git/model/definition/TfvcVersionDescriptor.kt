package net.lab0.azure.git.model.definition

import kotlin.String
import net.lab0.azure.git.model.definition.enumeration.TfvcVersionOption
import net.lab0.azure.git.model.definition.enumeration.TfvcVersionType

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
