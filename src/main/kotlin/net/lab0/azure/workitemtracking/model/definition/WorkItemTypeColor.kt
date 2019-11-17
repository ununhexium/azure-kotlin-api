package net.lab0.azure.workitemtracking.model.definition

import kotlin.String

/**
 * Describes a work item type's colors.
 */
interface WorkItemTypeColor {
  /**
   * Gets or sets the color of the primary.
   */
  val primaryColor: String

  /**
   * Gets or sets the color of the secondary.
   */
  val secondaryColor: String

  /**
   * The name of the work item type.
   */
  val workItemTypeName: String
}
