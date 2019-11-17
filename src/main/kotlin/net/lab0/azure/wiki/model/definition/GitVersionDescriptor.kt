package net.lab0.azure.wiki.model.definition

import kotlin.String
import net.lab0.azure.wiki.model.definition.enumeration.GitVersionOptions
import net.lab0.azure.wiki.model.definition.enumeration.GitVersionType

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
