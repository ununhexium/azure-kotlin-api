package net.lab0.azure.release.model.definition

import kotlin.Boolean

interface ControlOptions {
  val alwaysRun: Boolean

  val continueOnError: Boolean

  val enabled: Boolean
}
