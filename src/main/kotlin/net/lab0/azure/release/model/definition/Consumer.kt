package net.lab0.azure.release.model.definition

import kotlin.Int
import kotlin.String

interface Consumer {
  val consumerId: Int

  val consumerName: String
}
