package net.lab0.azure.model.definition.release

import kotlin.String

interface MultiConfigInput : ParallelExecutionInputBase {
  val multipliers: String
}
