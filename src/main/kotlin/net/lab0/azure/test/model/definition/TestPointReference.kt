package net.lab0.azure.test.model.definition

import kotlin.Int
import net.lab0.azure.test.model.definition.enumeration.TestPointState

interface TestPointReference {
  val id: Int

  val state: TestPointState
}
