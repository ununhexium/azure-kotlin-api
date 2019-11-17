package net.lab0.azure.release.model.definition

import kotlin.Int

interface RetentionPolicy {
  val daysToKeep: Int
}
