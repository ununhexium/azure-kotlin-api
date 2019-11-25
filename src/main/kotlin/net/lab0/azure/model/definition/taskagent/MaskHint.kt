package net.lab0.azure.model.definition.taskagent

import kotlin.String
import net.lab0.azure.model.definition.enumeration.taskagent.MaskType

interface MaskHint {
  val type: MaskType

  val value: String
}
