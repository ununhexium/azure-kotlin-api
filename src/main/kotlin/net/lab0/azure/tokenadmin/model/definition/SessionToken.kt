package net.lab0.azure.tokenadmin.model.definition

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

interface SessionToken {
  val accessId: String

  /**
   * This is populated when user requests a compact token. The alternate token value is self
   * describing token.
   */
  val alternateToken: String

  val authorizationId: String

  val clientId: String

  val displayName: String

  val hostAuthorizationId: String

  val isPublic: Boolean

  val isValid: Boolean

  val publicData: String

  val scope: String

  val source: String

  val targetAccounts: List<String>

  /**
   * This is computed and not returned in Get queries
   */
  val token: String

  val userId: String

  val validFrom: String

  val validTo: String
}
