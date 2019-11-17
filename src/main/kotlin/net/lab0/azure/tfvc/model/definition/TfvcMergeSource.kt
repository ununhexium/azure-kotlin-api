package net.lab0.azure.tfvc.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String

interface TfvcMergeSource {
  /**
   * Indicates if this a rename source. If false, it is a merge source.
   */
  val isRename: Boolean

  /**
   * The server item of the merge source.
   */
  val serverItem: String

  /**
   * Start of the version range.
   */
  val versionFrom: Int

  /**
   * End of the version range.
   */
  val versionTo: Int
}
