package net.lab0.azure.taskagent.model.definition

import kotlin.String
import kotlin.collections.List

/**
 * Azure management group query result
 */
interface AzureManagementGroupQueryResult {
  /**
   * Error message in case of an exception
   */
  val errorMessage: String

  /**
   * List of azure management groups
   */
  val value: List<AzureManagementGroup>
}
