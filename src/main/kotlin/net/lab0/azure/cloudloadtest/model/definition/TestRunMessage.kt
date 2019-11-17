package net.lab0.azure.cloudloadtest.model.definition

import kotlin.String
import net.lab0.azure.cloudloadtest.model.definition.enumeration.MessageSource
import net.lab0.azure.cloudloadtest.model.definition.enumeration.MessageType

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
