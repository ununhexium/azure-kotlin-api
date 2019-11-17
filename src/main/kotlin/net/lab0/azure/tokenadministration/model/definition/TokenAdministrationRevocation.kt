package net.lab0.azure.tokenadministration.model.definition

import kotlin.String
import kotlin.collections.List

interface TokenAdministrationRevocation {
  /**
   * A list of audience (target accounts) to limit the revocations to
   */
  val audience: List<String>

  /**
   * A list of authorization ID of the OAuth authorization to revoke.
   */
  val authorizationIds: List<String>
}
