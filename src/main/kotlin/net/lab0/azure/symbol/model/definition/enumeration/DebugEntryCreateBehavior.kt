package net.lab0.azure.symbol.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Defines what to do when a debug entry in the batch already exists.
 */
enum class DebugEntryCreateBehavior {
  /**
   * Throw exceptions at server end. This will translate to 409 (Conflict) HTTP status code.
   */
  @Json(name = "throwIfExists")
  THROW_IF_EXISTS,

  /**
   * Do not add this debug entry. The rest of the batch, if any, is not affected.
   */
  @Json(name = "skipIfExists")
  SKIP_IF_EXISTS,

  /**
   * Overwrite the existing debug entry.
   */
  @Json(name = "overwriteIfExists")
  OVERWRITE_IF_EXISTS
}
