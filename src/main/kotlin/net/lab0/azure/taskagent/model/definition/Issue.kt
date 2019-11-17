package net.lab0.azure.taskagent.model.definition

import javax.json.JsonObject
import kotlin.String
import net.lab0.azure.taskagent.model.definition.enumeration.IssueType

interface Issue {
  val category: String

  val data: JsonObject

  val message: String

  val type: IssueType
}
