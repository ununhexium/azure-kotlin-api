package net.lab0.azure.test.model.definition

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
