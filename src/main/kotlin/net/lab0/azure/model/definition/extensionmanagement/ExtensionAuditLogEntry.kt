package net.lab0.azure.model.definition.extensionmanagement

import kotlin.String

/**
 * An audit log entry for an extension
 */
interface ExtensionAuditLogEntry {
  /**
   * Change that was made to extension
   */
  val auditAction: String

  /**
   * Date at which the change was made
   */
  val auditDate: String

  /**
   * Extra information about the change
   */
  val comment: String

  val updatedBy: IdentityRef
}
