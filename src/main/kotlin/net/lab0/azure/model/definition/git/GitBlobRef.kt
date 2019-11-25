package net.lab0.azure.model.definition.git

import kotlin.Int
import kotlin.String

interface GitBlobRef {
  val _links: ReferenceLinks

  /**
   * SHA1 hash of git object
   */
  val objectId: String

  /**
   * Size of blob content (in bytes)
   */
  val size: Int

  val url: String
}
