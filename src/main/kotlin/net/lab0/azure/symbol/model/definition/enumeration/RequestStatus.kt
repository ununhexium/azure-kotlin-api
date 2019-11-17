package net.lab0.azure.symbol.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * The status for this request.
 */
enum class RequestStatus {
  /**
   * The status of this request is undefined or irrelevant in the current context.
   */
  @Json(name = "none")
  NONE,

  /**
   * The request is created, and is open to accepting debug entries.
   */
  @Json(name = "created")
  CREATED,

  /**
   * The request is sealed. No more debug entries can be added to it.
   */
  @Json(name = "sealed")
  SEALED,

  /**
   * The request is no longer available, possibly deleted.
   */
  @Json(name = "unavailable")
  UNAVAILABLE
}
