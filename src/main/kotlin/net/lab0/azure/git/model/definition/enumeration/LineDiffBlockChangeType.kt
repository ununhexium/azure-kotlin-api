package net.lab0.azure.git.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Type of change that was made to the block.
 */
enum class LineDiffBlockChangeType {
  /**
   * No change - both the blocks are identical
   */
  @Json(name = "none")
  NONE,

  /**
   * Lines were added to the block in the modified file
   */
  @Json(name = "add")
  ADD,

  /**
   * Lines were deleted from the block in the original file
   */
  @Json(name = "delete")
  DELETE,

  /**
   * Lines were modified
   */
  @Json(name = "edit")
  EDIT
}
