package net.lab0.azure.model.definition.cloudloadtest

import kotlin.String
import net.lab0.azure.model.definition.enumeration.cloudloadtest.MessageSource
import net.lab0.azure.model.definition.enumeration.cloudloadtest.MessageType

interface TestRunMessage {
  val agentId: String

  val errorCode: String

  val loggedDate: String

  val message: String

  val messageId: String

  val messageSource: MessageSource

  val messageType: MessageType

  val testRunId: String

  val url: String
}
