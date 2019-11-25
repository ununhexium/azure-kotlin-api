package net.lab0.azure.model.definition.release

import kotlin.String
import kotlin.collections.List

interface ReleaseGatesPhase : ReleaseDeployPhase {
  val ignoredGates: List<IgnoredGate>

  val stabilizationCompletedOn: String

  val succeedingSince: String
}
