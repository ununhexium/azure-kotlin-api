package net.lab0.azure.test.model.definition

import kotlin.String
import kotlin.collections.List

interface TestPointsEvent {
  val projectName: String

  val testPoints: List<TestPointReference>
}
