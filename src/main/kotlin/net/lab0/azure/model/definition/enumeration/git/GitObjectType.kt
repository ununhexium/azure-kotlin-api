package net.lab0.azure.model.definition.enumeration.git

import com.squareup.moshi.Json

/**
 * Type of object (Commit, Tree, Blob, Tag, ...)
 */
enum class GitObjectType {
  @Json(name = "bad")
  BAD,

  @Json(name = "commit")
  COMMIT,

  @Json(name = "tree")
  TREE,

  @Json(name = "blob")
  BLOB,

  @Json(name = "tag")
  TAG,

  @Json(name = "ext2")
  EXT2,

  @Json(name = "ofsDelta")
  OFS_DELTA,

  @Json(name = "refDelta")
  REF_DELTA
}
