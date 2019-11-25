package net.lab0.azure.model.definition.enumeration.accounts

import com.squareup.moshi.Json

/**
 * Type of account: Personal, Organization
 */
enum class AccountType {
  @Json(name = "personal")
  PERSONAL,

  @Json(name = "organization")
  ORGANIZATION
}
