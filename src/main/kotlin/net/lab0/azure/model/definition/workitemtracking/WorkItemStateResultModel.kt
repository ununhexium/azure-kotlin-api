package net.lab0.azure.model.definition.workitemtracking

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.workitemtracking.CustomizationType

interface WorkItemStateResultModel {
  val color: String

  val customizationType: CustomizationType

  val hidden: Boolean

  val id: String

  val name: String

  val order: Int

  val stateCategory: String

  val url: String
}
