package net.lab0.azure.security.model.definition

import kotlin.Int

/**
 * Class for encapsulating the allowed and denied permissions for a given IdentityDescriptor.
 */
interface AccessControlEntry {
  /**
   * The set of permission bits that represent the actions that the associated descriptor is allowed
   * to perform.
   */
  val allow: Int

  /**
   * The set of permission bits that represent the actions that the associated descriptor is not
   * allowed to perform.
   */
  val deny: Int

  val descriptor: IdentityDescriptor

  val extendedInfo: AceExtendedInformation
}
