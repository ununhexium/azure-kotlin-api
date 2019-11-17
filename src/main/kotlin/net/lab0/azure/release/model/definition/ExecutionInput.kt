package net.lab0.azure.release.model.definition

import net.lab0.azure.release.model.definition.enumeration.ParallelExecutionTypes

interface ExecutionInput {
  val parallelExecutionType: ParallelExecutionTypes
}
