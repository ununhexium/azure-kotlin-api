package net.lab0.azure.model.definition.tfvc

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
