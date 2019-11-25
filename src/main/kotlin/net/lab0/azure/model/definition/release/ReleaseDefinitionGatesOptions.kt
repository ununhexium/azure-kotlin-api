package net.lab0.azure.model.definition.release

import kotlin.Boolean
import kotlin.Int

interface ReleaseDefinitionGatesOptions {
  val isEnabled: Boolean

  val minimumSuccessDuration: Int

  val samplingInterval: Int

  val stabilizationTime: Int

  val timeout: Int
}
