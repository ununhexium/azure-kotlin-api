package net.lab0.azure.extensionmanagement.model.definition

import kotlin.String
import kotlin.collections.List
import net.lab0.azure.extensionmanagement.model.definition.enumeration.ExtensionStateFlags

/**
 * The state of an installed extension
 */
interface InstalledExtensionState {
  /**
   * States of an installed extension
   */
  val flags: ExtensionStateFlags

  /**
   * List of installation issues
   */
  val installationIssues: List<InstalledExtensionStateIssue>

  /**
   * The time at which this installation was last updated
   */
  val lastUpdated: String
}
