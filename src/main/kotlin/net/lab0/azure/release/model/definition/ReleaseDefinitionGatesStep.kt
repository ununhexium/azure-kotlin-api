package net.lab0.azure.release.model.definition

import kotlin.Int
import kotlin.collections.List

interface ReleaseDefinitionGatesStep {
  val gates: List<ReleaseDefinitionGate>

  val gatesOptions: ReleaseDefinitionGatesOptions

  val id: Int
}
