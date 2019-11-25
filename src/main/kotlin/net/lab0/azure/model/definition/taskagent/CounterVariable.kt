package net.lab0.azure.model.definition.taskagent

import kotlin.Int
import kotlin.String

interface CounterVariable {
  val prefix: String

  val seed: Int

  val value: Int
}
