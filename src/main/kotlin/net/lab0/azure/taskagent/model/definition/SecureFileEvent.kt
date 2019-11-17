package net.lab0.azure.taskagent.model.definition

import kotlin.String
import kotlin.collections.List

interface SecureFileEvent {
  val eventType: String

  val projectId: String

  val secureFiles: List<SecureFile>
}
