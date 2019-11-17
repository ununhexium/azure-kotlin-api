package net.lab0.azure.dashboard.model.definition

import kotlin.Int

/**
 * versioning for an artifact as described at: http://semver.org/, of the form major.minor.patch.
 */
interface SemanticVersion {
  /**
   * Major version when you make incompatible API changes
   */
  val major: Int

  /**
   * Minor version when you add functionality in a backwards-compatible manner
   */
  val minor: Int

  /**
   * Patch version when you make backwards-compatible bug fixes
   */
  val patch: Int
}
