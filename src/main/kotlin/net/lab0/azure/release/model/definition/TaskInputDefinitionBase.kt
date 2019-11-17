package net.lab0.azure.release.model.definition

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

interface TaskInputDefinitionBase {
  val aliases: List<String>

  val defaultValue: String

  val groupName: String

  val helpMarkDown: String

  val label: String

  val name: String

  val options: JsonObject

  val properties: JsonObject

  val required: Boolean

  val type: String

  val validation: TaskInputValidation

  val visibleRule: String
}
