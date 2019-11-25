package net.lab0.azure.model.definition.release

import kotlin.Boolean

interface ControlOptions {
  val alwaysRun: Boolean

  val continueOnError: Boolean

  val enabled: Boolean
}
