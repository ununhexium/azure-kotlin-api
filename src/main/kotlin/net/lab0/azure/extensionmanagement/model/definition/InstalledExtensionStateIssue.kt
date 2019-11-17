package net.lab0.azure.extensionmanagement.model.definition

import kotlin.String
import net.lab0.azure.extensionmanagement.model.definition.enumeration.InstalledExtensionStateIssueType

/**
 * Represents an installation issue
 */
interface InstalledExtensionStateIssue {
  /**
   * The error message
   */
  val message: String

  /**
   * Source of the installation issue, for example  "Demands"
   */
  val source: String

  /**
   * Installation issue type (Warning, Error)
   */
  val type: InstalledExtensionStateIssueType
}
