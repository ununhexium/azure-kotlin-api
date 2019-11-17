package net.lab0.azure.tfvc.model.definition

import kotlin.String
import net.lab0.azure.tfvc.model.definition.enumeration.ItemContentType

interface ItemContent {
  val content: String

  val contentType: ItemContentType
}
