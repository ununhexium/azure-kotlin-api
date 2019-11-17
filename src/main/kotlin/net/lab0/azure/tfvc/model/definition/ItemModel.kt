package net.lab0.azure.tfvc.model.definition

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
