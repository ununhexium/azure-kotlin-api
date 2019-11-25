package net.lab0.azure.model.definition.extensionmanagement

import net.lab0.azure.model.definition.enumeration.extensionmanagement.ExtensionPolicyFlags

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
