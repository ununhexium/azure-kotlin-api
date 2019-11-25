package net.lab0.azure.model.definition.git

import kotlin.String
import net.lab0.azure.model.definition.enumeration.git.VersionControlChangeType

interface HistoryEntry {
  val changeList: ChangeList

  /**
   * The change made to the item from this change list (only relevant for File history, not folders)
   */
  val itemChangeType: VersionControlChangeType

  /**
   * The path of the item at this point in history (only relevant for File history, not folders)
   */
  val serverItem: String
}
