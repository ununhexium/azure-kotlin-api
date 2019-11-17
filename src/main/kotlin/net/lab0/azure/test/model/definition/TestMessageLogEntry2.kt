package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String

interface TestMessageLogEntry2 {
  val dateCreated: String

  val entryId: Int

  val logLevel: String

  val logUser: String

  val message: String

  val testMessageLogId: Int
}
