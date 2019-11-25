package net.lab0.azure.model.definition.workitemtracking

import kotlin.String

/**
 * Describes a reference to an identity.
 */
interface IdentityReference : IdentityRef {
  override val id: String

  /**
   * Legacy back-compat property. This has been the WIT specific value from Constants. Will be
   * hidden (but exists) on the client unless they are targeting the newest version
   */
  val name: String
}
