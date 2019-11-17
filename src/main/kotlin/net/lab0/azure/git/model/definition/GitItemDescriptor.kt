package net.lab0.azure.git.model.definition

import kotlin.String
import net.lab0.azure.git.model.definition.enumeration.GitVersionOptions
import net.lab0.azure.git.model.definition.enumeration.GitVersionType
import net.lab0.azure.git.model.definition.enumeration.VersionControlRecursionType

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
