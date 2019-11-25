package net.lab0.azure.model.definition.tfvc

import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Metadata for an item.
 */
interface TfvcItem : ItemModel {
  /**
   * Item changed datetime.
   */
  val changeDate: String

  /**
   * Greater than 0 if item is deleted.
   */
  val deletionId: Int

  /**
   * File encoding from database, -1 represents binary.
   */
  val encoding: Int

  /**
   * MD5 hash as a base 64 string, applies to files only.
   */
  val hashValue: String

  /**
   * True if item is a branch.
   */
  val isBranch: Boolean

  /**
   * True if there is a change pending.
   */
  val isPendingChange: Boolean

  /**
   * The size of the file, if applicable.
   */
  val size: Int

  /**
   * Changeset version Id.
   */
  val version: Int
}
