package net.lab0.azure.model.definition.test

import kotlin.String
import kotlin.collections.List

interface TestPointsEvent {
  val projectName: String

  val testPoints: List<TestPointReference>
}
