package net.lab0.azure.model.definition.tfvc

import kotlin.String
import net.lab0.azure.model.definition.enumeration.tfvc.TfvcVersionOption
import net.lab0.azure.model.definition.enumeration.tfvc.TfvcVersionType

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
