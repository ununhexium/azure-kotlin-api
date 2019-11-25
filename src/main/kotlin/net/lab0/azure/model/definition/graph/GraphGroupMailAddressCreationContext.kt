package net.lab0.azure.model.definition.graph

import kotlin.String

/**
 * Use this type to create a new group using the mail address as a reference to an existing group
 * from an external AD or AAD backed provider. This is the subset of GraphGroup fields required for
 * creation of a group for the AAD and AD use case.
 */
interface GraphGroupMailAddressCreationContext : GraphGroupCreationContext {
  /**
   * This should be the mail address or the group in the source AD or AAD provider. Example:
   * jamal@contoso.com Team Services will communicate with the source provider to fill all other fields
   * on creation.
   */
  val mailAddress: String
}
