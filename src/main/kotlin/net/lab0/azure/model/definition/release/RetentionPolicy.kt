package net.lab0.azure.model.definition.release

import kotlin.Int

interface RetentionPolicy {
  val daysToKeep: Int
}
