package net.lab0.azure.taskagent.model.definition

import javax.json.JsonObject
import kotlin.collections.List

interface PlanEnvironment {
  val mask: List<MaskHint>

  val options: JsonObject

  val variables: JsonObject
}
