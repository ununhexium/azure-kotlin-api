package net.lab0.azure.model.definition.extensionmanagement

import kotlin.String

/**
 * Represents the extension policy applied to a given user
 */
interface UserExtensionPolicy {
  /**
   * User display name that this policy refers to
   */
  val displayName: String

  val permissions: ExtensionPolicy

  /**
   * User id that this policy refers to
   */
  val userId: String
}
