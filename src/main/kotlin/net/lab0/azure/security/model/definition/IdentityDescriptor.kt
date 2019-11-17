package net.lab0.azure.security.model.definition

import kotlin.String

/**
 * An Identity descriptor is a wrapper for the identity type (Windows SID, Passport) along with a
 * unique identifier such as the SID or PUID.
 */
interface IdentityDescriptor {
  /**
   * The unique identifier for this identity, not exceeding 256 chars, which will be persisted.
   */
  val identifier: String

  /**
   * Type of descriptor (for example, Windows, Passport, etc.).
   */
  val identityType: String
}
