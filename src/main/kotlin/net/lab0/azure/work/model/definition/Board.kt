package net.lab0.azure.work.model.definition

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.Int
import kotlin.collections.List

interface Board : BoardReference {
  val _links: ReferenceLinks

  val allowedMappings: JsonObject

  val canEdit: Boolean

  val columns: List<BoardColumn>

  val fields: BoardFields

  val isValid: Boolean

  val revision: Int

  val rows: List<BoardRow>
}
