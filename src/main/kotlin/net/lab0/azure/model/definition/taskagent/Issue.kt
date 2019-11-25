package net.lab0.azure.model.definition.taskagent

import javax.json.JsonObject
import kotlin.String
import net.lab0.azure.model.definition.enumeration.taskagent.IssueType

interface Issue {
  val category: String

  val data: JsonObject

  val message: String

  val type: IssueType
}
