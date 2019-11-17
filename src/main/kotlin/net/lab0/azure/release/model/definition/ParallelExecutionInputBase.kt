package net.lab0.azure.release.model.definition

import kotlin.Boolean
import kotlin.Int

interface ParallelExecutionInputBase : ExecutionInput {
  val continueOnError: Boolean

  val maxNumberOfAgents: Int
}
