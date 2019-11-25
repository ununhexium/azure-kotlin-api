package net.lab0.azure.model.definition.enumeration.git

import com.squareup.moshi.Json

/**
 * The comment type at the time of creation.
 */
enum class CommentType {
  /**
   * The comment type is not known.
   */
  @Json(name = "unknown")
  UNKNOWN,

  /**
   * This is a regular user comment.
   */
  @Json(name = "text")
  TEXT,

  /**
   * The comment comes as a result of a code change.
   */
  @Json(name = "codeChange")
  CODE_CHANGE,

  /**
   * The comment represents a system message.
   */
  @Json(name = "system")
  SYSTEM
}
