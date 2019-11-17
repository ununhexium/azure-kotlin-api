package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String

interface TestMessageLogEntry {
  val dateCreated: String

  val entryId: Int

  val logLevel: String

  val logUser: String

  val logUserName: String

  val message: String

  val testMessageLogId: Int
}
