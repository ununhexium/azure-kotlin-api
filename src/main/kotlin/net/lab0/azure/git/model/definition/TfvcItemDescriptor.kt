package net.lab0.azure.git.model.definition

import kotlin.String
import net.lab0.azure.git.model.definition.enumeration.TfvcVersionOption
import net.lab0.azure.git.model.definition.enumeration.TfvcVersionType
import net.lab0.azure.git.model.definition.enumeration.VersionControlRecursionType

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
