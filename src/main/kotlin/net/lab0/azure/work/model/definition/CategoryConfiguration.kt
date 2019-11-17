package net.lab0.azure.work.model.definition

import kotlin.String
import kotlin.collections.List

/**
 * Details about a given backlog category
 */
interface CategoryConfiguration {
  /**
   * Name
   */
  val name: String

  /**
   * Category Reference Name
   */
  val referenceName: String

  /**
   * Work item types for the backlog category
   */
  val workItemTypes: List<WorkItemTypeReference>
}
