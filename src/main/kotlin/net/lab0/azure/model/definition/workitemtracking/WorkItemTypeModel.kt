package net.lab0.azure.model.definition.workitemtracking

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.workitemtracking.WorkItemTypeClass

interface WorkItemTypeModel {
  val behaviors: List<WorkItemTypeBehavior>

  val `class`: WorkItemTypeClass

  val color: String

  val description: String

  val icon: String

  val id: String

  /**
   * Parent WIT Id/Internal ReferenceName that it inherits from
   */
  val inherits: String

  val isDisabled: Boolean

  val layout: FormLayout

  val name: String

  val states: List<WorkItemStateResultModel>

  val url: String
}
