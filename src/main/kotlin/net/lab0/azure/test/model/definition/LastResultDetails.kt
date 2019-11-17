package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String

interface LastResultDetails {
  val dateCompleted: String

  val duration: Int

  val runBy: IdentityRef
}
