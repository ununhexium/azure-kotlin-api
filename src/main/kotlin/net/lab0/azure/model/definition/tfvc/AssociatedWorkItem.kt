package net.lab0.azure.model.definition.tfvc

import kotlin.Int
import kotlin.String

interface AssociatedWorkItem {
  val assignedTo: String

  /**
   * Id of associated the work item.
   */
  val id: Int

  val state: String

  val title: String

  /**
   * REST Url of the work item.
   */
  val url: String

  val webUrl: String

  val workItemType: String
}
