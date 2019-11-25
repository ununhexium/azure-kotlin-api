package net.lab0.azure.model.definition.test

import kotlin.Int
import net.lab0.azure.model.definition.enumeration.test.TestPointState

interface TestPointReference {
  val id: Int

  val state: TestPointState
}
