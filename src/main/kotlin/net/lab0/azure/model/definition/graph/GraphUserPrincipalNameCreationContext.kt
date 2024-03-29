package net.lab0.azure.model.definition.graph

import kotlin.String

/**
 * Use this type to create a new user using the principal name as a reference to an existing user
 * from an external AD or AAD backed provider. This is the subset of GraphUser fields required for
 * creation of a GraphUser for the AD and AAD use case when looking up the user by its principal name
 * in the backing provider.
 */
interface GraphUserPrincipalNameCreationContext : GraphUserCreationContext {
  /**
   * This should be the principal name or upn of the user in the source AD or AAD provider. Example:
   * jamal@contoso.com Team Services will communicate with the source provider to fill all other fields
   * on creation.
   */
  val principalName: String
}
