package net.lab0.azure.model.definition.work

import kotlin.String

/**
 * Work item color and icon.
 */
interface WorkItemColor {
  val icon: String

  val primaryColor: String

  val workItemTypeName: String
}
