package net.lab0.azure.model.definition.tokenadministration

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
