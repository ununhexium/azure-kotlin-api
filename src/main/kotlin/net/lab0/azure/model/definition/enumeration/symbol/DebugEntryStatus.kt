package net.lab0.azure.model.definition.enumeration.symbol

import com.squareup.moshi.Json

/**
 * The status of debug entry.
 */
enum class DebugEntryStatus {
  /**
   * The status of this debug entry is undefined or irrelevant in the current context.
   */
  @Json(name = "none")
  NONE,

  /**
   * The debug entry is created and read to use.
   */
  @Json(name = "created")
  CREATED,

  /**
   * The symbol file for the requested debug entry is missing.
   */
  @Json(name = "blobMissing")
  BLOB_MISSING
}
