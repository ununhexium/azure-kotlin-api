package net.lab0.azure.work.model.definition

import kotlin.String

/**
 * Work item color and icon.
 */
interface WorkItemColor {
  val icon: String

  val primaryColor: String

  val workItemTypeName: String
}
