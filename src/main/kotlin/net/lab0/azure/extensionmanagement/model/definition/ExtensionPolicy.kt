package net.lab0.azure.extensionmanagement.model.definition

import net.lab0.azure.extensionmanagement.model.definition.enumeration.ExtensionPolicyFlags

/**
 * Policy with a set of permissions on extension operations
 */
interface ExtensionPolicy {
  /**
   * Permissions on 'Install' operation
   */
  val install: ExtensionPolicyFlags

  /**
   * Permission on 'Request' operation
   */
  val request: ExtensionPolicyFlags
}
