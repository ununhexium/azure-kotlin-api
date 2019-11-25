package net.lab0.azure.model.definition.release

import kotlin.Int

interface RetentionSettings {
  val daysToKeepDeletedReleases: Int

  val defaultEnvironmentRetentionPolicy: EnvironmentRetentionPolicy

  val maximumEnvironmentRetentionPolicy: EnvironmentRetentionPolicy
}
