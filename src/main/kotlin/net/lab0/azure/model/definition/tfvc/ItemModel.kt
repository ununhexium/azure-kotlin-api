package net.lab0.azure.model.definition.tfvc

import kotlin.Boolean
import kotlin.String

interface ItemModel {
  val _links: ReferenceLinks

  val content: String

  val contentMetadata: FileContentMetadata

  val isFolder: Boolean

  val isSymLink: Boolean

  val path: String

  val url: String
}
