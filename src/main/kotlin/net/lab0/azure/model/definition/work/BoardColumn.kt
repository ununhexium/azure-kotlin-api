package net.lab0.azure.model.definition.work

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.work.BoardColumnType

interface BoardColumn {
  val columnType: BoardColumnType

  val description: String

  val id: String

  val isSplit: Boolean

  val itemLimit: Int

  val name: String

  val stateMappings: JsonObject
}
