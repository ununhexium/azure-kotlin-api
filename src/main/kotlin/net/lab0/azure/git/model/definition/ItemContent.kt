package net.lab0.azure.git.model.definition

import kotlin.String
import net.lab0.azure.git.model.definition.enumeration.ItemContentType

interface ItemContent {
  val content: String

  val contentType: ItemContentType
}
