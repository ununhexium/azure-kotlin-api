package net.lab0.azure.taskagent.model.definition

import kotlin.String

/**
 * Azure Management Group
 */
interface AzureManagementGroup {
  /**
   * Display name of azure management group
   */
  val displayName: String

  /**
   * Id of azure management group
   */
  val id: String

  /**
   * Azure management group name
   */
  val name: String

  /**
   * Id of tenant from which azure management group belogs
   */
  val tenantId: String
}
