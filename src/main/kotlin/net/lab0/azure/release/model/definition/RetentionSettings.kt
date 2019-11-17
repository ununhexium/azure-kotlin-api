package net.lab0.azure.release.model.definition

import kotlin.Int

interface RetentionSettings {
  val daysToKeepDeletedReleases: Int

  val defaultEnvironmentRetentionPolicy: EnvironmentRetentionPolicy

  val maximumEnvironmentRetentionPolicy: EnvironmentRetentionPolicy
}
