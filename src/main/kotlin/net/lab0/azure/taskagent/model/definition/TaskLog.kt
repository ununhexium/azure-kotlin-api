package net.lab0.azure.taskagent.model.definition

import kotlin.Int
import kotlin.String

interface TaskLog : TaskLogReference {
  val createdOn: String

  val indexLocation: String

  val lastChangedOn: String

  val lineCount: Int

  val path: String
}
