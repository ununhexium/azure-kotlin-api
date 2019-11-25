package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String

interface TestResolutionState {
  val id: Int

  val name: String

  val project: ShallowReference
}
