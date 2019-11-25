package net.lab0.azure.model.definition.tokenadmin

import kotlin.String

/**
 * A rule which is applied to disable any incoming delegated authorization which matches the given
 * properties.
 */
interface TokenAdminRevocationRule {
  /**
   * A datetime cutoff. Tokens created before this time will be rejected. This is an optional
   * paramter. If omitted, defaults to the time at which the rule was created.
   */
  val createdBefore: String

  /**
   * A string containing a space-delimited list of OAuth scopes. A token matching any one of the
   * scopes will be rejected. For a list of all OAuth scopes supported by VSTS, see:
   * https://docs.microsoft.com/en-us/vsts/integrate/get-started/authentication/oauth?view=vsts#scopes.
   * This is a mandatory parameter.
   */
  val scopes: String
}
