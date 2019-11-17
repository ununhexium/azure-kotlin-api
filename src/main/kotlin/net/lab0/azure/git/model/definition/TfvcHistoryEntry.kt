package net.lab0.azure.git.model.definition

import kotlin.Int

interface TfvcHistoryEntry : HistoryEntry {
  /**
   * The encoding of the item at this point in history (only relevant for File history, not folders)
   */
  val encoding: Int

  /**
   * The file id of the item at this point in history (only relevant for File history, not folders)
   */
  val fileId: Int
}
