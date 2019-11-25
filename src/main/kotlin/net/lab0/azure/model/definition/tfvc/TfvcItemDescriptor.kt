package net.lab0.azure.model.definition.tfvc

import kotlin.String
import net.lab0.azure.model.definition.enumeration.tfvc.TfvcVersionOption
import net.lab0.azure.model.definition.enumeration.tfvc.TfvcVersionType
import net.lab0.azure.model.definition.enumeration.tfvc.VersionControlRecursionType

/**
 * Item path and Version descriptor properties
 */
interface TfvcItemDescriptor {
  /**
   * Item path.
   */
  val path: String

  /**
   * Defaults to OneLevel.
   */
  val recursionLevel: VersionControlRecursionType

  /**
   * Specify the desired version, can be null or empty string only if VersionType is latest or tip.
   */
  val version: String

  /**
   * Defaults to None.
   */
  val versionOption: TfvcVersionOption

  /**
   * Defaults to Latest.
   */
  val versionType: TfvcVersionType
}
