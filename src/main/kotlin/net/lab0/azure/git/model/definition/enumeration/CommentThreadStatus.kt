package net.lab0.azure.git.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * The status of the comment thread.
 */
enum class CommentThreadStatus {
  /**
   * The thread status is unknown.
   */
  @Json(name = "unknown")
  UNKNOWN,

  /**
   * The thread status is active.
   */
  @Json(name = "active")
  ACTIVE,

  /**
   * The thread status is resolved as fixed.
   */
  @Json(name = "fixed")
  FIXED,

  /**
   * The thread status is resolved as won't fix.
   */
  @Json(name = "wontFix")
  WONT_FIX,

  /**
   * The thread status is closed.
   */
  @Json(name = "closed")
  CLOSED,

  /**
   * The thread status is resolved as by design.
   */
  @Json(name = "byDesign")
  BY_DESIGN,

  /**
   * The thread status is pending.
   */
  @Json(name = "pending")
  PENDING
}
