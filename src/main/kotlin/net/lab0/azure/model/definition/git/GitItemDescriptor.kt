package net.lab0.azure.model.definition.git

import kotlin.String
import net.lab0.azure.model.definition.enumeration.git.GitVersionOptions
import net.lab0.azure.model.definition.enumeration.git.GitVersionType
import net.lab0.azure.model.definition.enumeration.git.VersionControlRecursionType

interface GitItemDescriptor {
  /**
   * Path to item
   */
  val path: String

  /**
   * Specifies whether to include children (OneLevel), all descendants (Full), or None
   */
  val recursionLevel: VersionControlRecursionType

  /**
   * Version string (interpretation based on VersionType defined in subclass
   */
  val version: String

  /**
   * Version modifiers (e.g. previous)
   */
  val versionOptions: GitVersionOptions

  /**
   * How to interpret version (branch,tag,commit)
   */
  val versionType: GitVersionType
}
