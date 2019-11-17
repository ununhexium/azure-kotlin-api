package net.lab0.azure.testplan.model.definition

import kotlin.Int
import kotlin.String

interface LastResultDetails {
  val dateCompleted: String

  val duration: Int

  val runBy: IdentityRef
}
