package net.lab0.azure.model.definition.enumeration.tfvc

import com.squareup.moshi.Json

/**
 * Project state.
 */
enum class ProjectState {
  /**
   * Project is in the process of being deleted.
   */
  @Json(name = "deleting")
  DELETING,

  /**
   * Project is in the process of being created.
   */
  @Json(name = "new")
  NEW,

  /**
   * Project is completely created and ready to use.
   */
  @Json(name = "wellFormed")
  WELL_FORMED,

  /**
   * Project has been queued for creation, but the process has not yet started.
   */
  @Json(name = "createPending")
  CREATE_PENDING,

  /**
   * All projects regardless of state.
   */
  @Json(name = "all")
  ALL,

  /**
   * Project has not been changed.
   */
  @Json(name = "unchanged")
  UNCHANGED,

  /**
   * Project has been deleted.
   */
  @Json(name = "deleted")
  DELETED
}
