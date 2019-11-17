package net.lab0.azure.security.model.definition

import kotlin.Int

/**
 * Holds the inherited and effective permission information for a given AccessControlEntry.
 */
interface AceExtendedInformation {
  /**
   * This is the combination of all of the explicit and inherited permissions for this identity on
   * this token.  These are the permissions used when determining if a given user has permission to
   * perform an action.
   */
  val effectiveAllow: Int

  /**
   * This is the combination of all of the explicit and inherited permissions for this identity on
   * this token.  These are the permissions used when determining if a given user has permission to
   * perform an action.
   */
  val effectiveDeny: Int

  /**
   * These are the permissions that are inherited for this identity on this token.  If the token
   * does not inherit permissions this will be 0.  Note that any permissions that have been explicitly
   * set on this token for this identity, or any groups that this identity is a part of, are not
   * included here.
   */
  val inheritedAllow: Int

  /**
   * These are the permissions that are inherited for this identity on this token.  If the token
   * does not inherit permissions this will be 0.  Note that any permissions that have been explicitly
   * set on this token for this identity, or any groups that this identity is a part of, are not
   * included here.
   */
  val inheritedDeny: Int
}
