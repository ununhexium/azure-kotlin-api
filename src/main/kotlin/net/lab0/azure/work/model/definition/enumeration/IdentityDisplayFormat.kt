package net.lab0.azure.work.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Display format for the assigned to field
 */
enum class IdentityDisplayFormat {
  /**
   * Display avatar only
   */
  @Json(name = "avatarOnly")
  AVATAR_ONLY,

  /**
   * Display Full name only
   */
  @Json(name = "fullName")
  FULL_NAME,

  /**
   * Display Avatar and Full name
   */
  @Json(name = "avatarAndFullName")
  AVATAR_AND_FULL_NAME
}
