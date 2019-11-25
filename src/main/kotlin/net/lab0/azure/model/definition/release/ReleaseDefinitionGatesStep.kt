package net.lab0.azure.model.definition.release

import kotlin.Int
import kotlin.collections.List

interface ReleaseDefinitionGatesStep {
  val gates: List<ReleaseDefinitionGate>

  val gatesOptions: ReleaseDefinitionGatesOptions

  val id: Int
}
