package net.lab0.azure.taskagent.model.definition

import kotlin.Int
import kotlin.String

interface DiagnosticLogMetadata {
  val agentId: Int

  val agentName: String

  val fileName: String

  val phaseName: String

  val phaseResult: String

  val poolId: Int
}
