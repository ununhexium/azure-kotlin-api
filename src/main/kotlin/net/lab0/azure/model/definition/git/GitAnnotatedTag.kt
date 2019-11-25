package net.lab0.azure.model.definition.git

import kotlin.String

/**
 * A Git annotated tag.
 */
interface GitAnnotatedTag {
  /**
   * The tagging Message
   */
  val message: String

  /**
   * The name of the annotated tag.
   */
  val name: String

  /**
   * The objectId (Sha1Id) of the tag.
   */
  val objectId: String

  val taggedBy: GitUserDate

  val taggedObject: GitObject

  val url: String
}
