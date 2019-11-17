package net.lab0.azure.taskagent.model.definition

import kotlin.String
import net.lab0.azure.taskagent.model.definition.enumeration.MaskType

interface MaskHint {
  val type: MaskType

  val value: String
}
