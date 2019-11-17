package net.lab0.azure.release.model.definition

import kotlin.Boolean
import kotlin.Int

interface EnvironmentRetentionPolicy {
  val daysToKeep: Int

  val releasesToKeep: Int

  val retainBuild: Boolean
}
