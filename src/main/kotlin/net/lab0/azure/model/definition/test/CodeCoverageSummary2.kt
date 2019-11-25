package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String

interface CodeCoverageSummary2 {
  val buildConfigurationId: Int

  val covered: Int

  val label: String

  val position: Int

  val projectId: String

  val total: Int
}
