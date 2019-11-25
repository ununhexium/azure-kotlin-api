package net.lab0.azure.model.definition.git

import kotlin.String
import net.lab0.azure.model.definition.enumeration.git.GitVersionOptions
import net.lab0.azure.model.definition.enumeration.git.GitVersionType

interface GitVersionDescriptor {
  /**
   * Version string identifier (name of tag/branch, SHA1 of commit)
   */
  val version: String

  /**
   * Version options - Specify additional modifiers to version (e.g Previous)
   */
  val versionOptions: GitVersionOptions

  /**
   * Version type (branch, tag, or commit). Determines how Id is interpreted
   */
  val versionType: GitVersionType
}
