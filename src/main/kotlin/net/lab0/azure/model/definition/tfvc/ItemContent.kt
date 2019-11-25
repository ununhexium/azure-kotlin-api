package net.lab0.azure.model.definition.tfvc

import kotlin.String
import net.lab0.azure.model.definition.enumeration.tfvc.ItemContentType

interface ItemContent {
  val content: String

  val contentType: ItemContentType
}
