package net.lab0.azure.git.model.definition

import kotlin.String
import net.lab0.azure.git.model.definition.enumeration.GitVersionOptions
import net.lab0.azure.git.model.definition.enumeration.GitVersionType

interface GitBaseVersionDescriptor : GitVersionDescriptor {
  /**
   * Version string identifier (name of tag/branch, SHA1 of commit)
   */
  val baseVersion: String

  /**
   * Version options - Specify additional modifiers to version (e.g Previous)
   */
  val baseVersionOptions: GitVersionOptions

  /**
   * Version type (branch, tag, or commit). Determines how Id is interpreted
   */
  val baseVersionType: GitVersionType
}
