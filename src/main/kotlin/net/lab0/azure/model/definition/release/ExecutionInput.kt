package net.lab0.azure.model.definition.release

import net.lab0.azure.model.definition.enumeration.release.ParallelExecutionTypes

interface ExecutionInput {
  val parallelExecutionType: ParallelExecutionTypes
}
