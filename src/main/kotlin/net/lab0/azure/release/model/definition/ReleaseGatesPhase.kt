package net.lab0.azure.release.model.definition

import kotlin.String
import kotlin.collections.List

interface ReleaseGatesPhase : ReleaseDeployPhase {
  val ignoredGates: List<IgnoredGate>

  val stabilizationCompletedOn: String

  val succeedingSince: String
}
