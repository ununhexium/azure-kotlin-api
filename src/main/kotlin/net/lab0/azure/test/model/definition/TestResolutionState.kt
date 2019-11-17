package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String

interface TestResolutionState {
  val id: Int

  val name: String

  val project: ShallowReference
}
