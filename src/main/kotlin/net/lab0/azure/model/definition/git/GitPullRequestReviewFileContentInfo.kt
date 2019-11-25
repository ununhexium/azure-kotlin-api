package net.lab0.azure.model.definition.git

import kotlin.String

interface GitPullRequestReviewFileContentInfo {
  val _links: ReferenceLinks

  /**
   * The file change path.
   */
  val path: String

  /**
   * Content hash of on-disk representation of file content. Its calculated by the client by using
   * SHA1 hash function. Ensure that uploaded file has same encoding as in source control.
   */
  val sHA1Hash: String
}
