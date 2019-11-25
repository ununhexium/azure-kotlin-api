package net.lab0.azure.model.definition.extensionmanagement

import kotlin.String
import kotlin.collections.List

/**
 * Audit log for an extension
 */
interface ExtensionAuditLog {
  /**
   * Collection of audit log entries
   */
  val entries: List<ExtensionAuditLogEntry>

  /**
   * Extension that the change was made for
   */
  val extensionName: String

  /**
   * Publisher that the extension is part of
   */
  val publisherName: String
}
