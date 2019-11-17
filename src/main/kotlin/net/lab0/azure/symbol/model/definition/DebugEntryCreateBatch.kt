package net.lab0.azure.symbol.model.definition

import kotlin.collections.List
import net.lab0.azure.symbol.model.definition.enumeration.DebugEntryCreateBehavior

/**
 * A batch of debug entry to create.
 */
interface DebugEntryCreateBatch {
  /**
   * Defines what to do when a debug entry in the batch already exists.
   */
  val createBehavior: DebugEntryCreateBehavior

  /**
   * The debug entries.
   */
  val debugEntries: List<DebugEntry>
}
