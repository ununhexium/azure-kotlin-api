package net.lab0.azure.model.definition.tokenadministration

import kotlin.String
import kotlin.collections.List

/**
 * A paginatated list of session tokens. Session tokens correspond to OAuth credentials such as
 * personal access tokens (PATs) and other OAuth authorizations.
 */
interface TokenAdminPagedSessionTokens {
  /**
   * The continuation token that can be used to retrieve the next page of session tokens, or
   * <code>null</code> if there is no next page.
   */
  val continuationToken: String

  /**
   * The list of all session tokens in the current page.
   */
  val value: List<SessionToken>
}
