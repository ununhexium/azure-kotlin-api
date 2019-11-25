package net.lab0.azure.model.definition.release

import kotlin.Int
import kotlin.String

interface Consumer {
  val consumerId: Int

  val consumerName: String
}
