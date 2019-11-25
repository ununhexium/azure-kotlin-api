package net.lab0.azure.model.definition.git

import kotlin.String
import net.lab0.azure.model.definition.enumeration.git.ItemContentType

interface ItemContent {
  val content: String

  val contentType: ItemContentType
}
