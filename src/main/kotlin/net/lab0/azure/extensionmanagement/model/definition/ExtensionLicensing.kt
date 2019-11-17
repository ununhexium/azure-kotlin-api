package net.lab0.azure.extensionmanagement.model.definition

import kotlin.collections.List

/**
 * How an extension should handle including contributions based on licensing
 */
interface ExtensionLicensing {
  /**
   * A list of contributions which deviate from the default licensing behavior
   */
  val overrides: List<LicensingOverride>
}
