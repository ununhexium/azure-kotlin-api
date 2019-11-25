package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String

interface LastResultDetails {
  val dateCompleted: String

  val duration: Int

  val runBy: IdentityRef
}
