package net.lab0.azure.model.definition.test

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.test.TestPointState

interface TestAuthoringDetails {
  val configurationId: Int

  val isAutomated: Boolean

  val lastUpdated: String

  val pointId: Int

  val priority: String

  val runBy: String

  val state: TestPointState

  val suiteId: Int

  val testerId: String
}
