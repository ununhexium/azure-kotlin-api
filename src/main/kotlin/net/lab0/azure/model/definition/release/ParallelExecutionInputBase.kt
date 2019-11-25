package net.lab0.azure.model.definition.release

import kotlin.Boolean
import kotlin.Int

interface ParallelExecutionInputBase : ExecutionInput {
  val continueOnError: Boolean

  val maxNumberOfAgents: Int
}
