package net.lab0.azure.model.definition.git

import kotlin.String

/**
 * Metadata for an item including the previous hash value for files.
 */
interface TfvcItemPreviousHash : TfvcItem {
  /**
   * MD5 hash as a base 64 string, applies to files only.
   */
  val previousHashValue: String
}
