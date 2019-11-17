package net.lab0.azure.git.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String

interface FileContentMetadata {
  val contentType: String

  val encoding: Int

  val extension: String

  val fileName: String

  val isBinary: Boolean

  val isImage: Boolean

  val vsLink: String
}
