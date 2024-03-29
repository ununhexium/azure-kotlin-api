package net.lab0.azure.model.definition.wiki

import kotlin.String
import kotlin.collections.List

/**
 * Wiki update parameters.
 */
interface WikiUpdateParameters {
  /**
   * Name for wiki.
   */
  val name: String

  /**
   * Versions of the wiki.
   */
  val versions: List<GitVersionDescriptor>
}
