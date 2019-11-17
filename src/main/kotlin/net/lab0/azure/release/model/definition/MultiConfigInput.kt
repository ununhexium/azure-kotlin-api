package net.lab0.azure.release.model.definition

import kotlin.String

interface MultiConfigInput : ParallelExecutionInputBase {
  val multipliers: String
}
