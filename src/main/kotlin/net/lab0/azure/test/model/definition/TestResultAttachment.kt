package net.lab0.azure.test.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.test.model.definition.enumeration.AttachmentType

interface TestResultAttachment {
  val actionPath: String

  val attachmentType: AttachmentType

  val comment: String

  val creationDate: String

  val downloadQueryString: String

  val fileName: String

  val id: Int

  val isComplete: Boolean

  val iterationId: Int

  val length: Int

  val sessionId: Int

  val testResultId: Int

  val testRunId: Int

  val tmiRunId: String
}
