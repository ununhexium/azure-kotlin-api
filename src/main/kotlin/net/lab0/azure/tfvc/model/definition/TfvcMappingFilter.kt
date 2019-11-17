package net.lab0.azure.tfvc.model.definition

import kotlin.Boolean
import kotlin.String

/**
 * MappingFilter can be used to include or exclude specific paths.
 */
interface TfvcMappingFilter {
  /**
   * True if ServerPath should be excluded.
   */
  val exclude: Boolean

  /**
   * Path to be included or excluded.
   */
  val serverPath: String
}
