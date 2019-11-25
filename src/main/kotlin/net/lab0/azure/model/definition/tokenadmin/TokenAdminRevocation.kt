package net.lab0.azure.model.definition.tokenadmin

import kotlin.String

/**
 * A request to revoke a particular delegated authorization.
 */
interface TokenAdminRevocation {
  /**
   * The authorization ID of the OAuth authorization to revoke.
   */
  val authorizationId: String
}
