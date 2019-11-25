package net.lab0.azure.model.definition.symbol

import kotlin.String

interface ResourceBase {
  /**
   * The ID of user who created this item. Optional.
   */
  val createdBy: String

  /**
   * The date time when this item is created. Optional.
   */
  val createdDate: String

  /**
   * An identifier for this item. Optional.
   */
  val id: String

  /**
   * An opaque ETag used to synchronize with the version stored at server end. Optional.
   */
  val storageETag: String

  /**
   * A URI which can be used to retrieve this item in its raw format. Optional. Note this is
   * distinguished from other URIs that are present in a derived resource.
   */
  val url: String
}
