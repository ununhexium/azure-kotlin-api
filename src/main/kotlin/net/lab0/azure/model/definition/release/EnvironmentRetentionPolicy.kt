package net.lab0.azure.model.definition.release

import kotlin.Boolean
import kotlin.Int

interface EnvironmentRetentionPolicy {
  val daysToKeep: Int

  val releasesToKeep: Int

  val retainBuild: Boolean
}
