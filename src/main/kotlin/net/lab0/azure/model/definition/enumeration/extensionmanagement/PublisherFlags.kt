package net.lab0.azure.model.definition.enumeration.extensionmanagement

import com.squareup.moshi.Json

enum class PublisherFlags {
  /**
   * This should never be returned, it is used to represent a publisher who's flags havent changed
   * during update calls.
   */
  @Json(name = "unChanged")
  UN_CHANGED,

  /**
   * No flags exist for this publisher.
   */
  @Json(name = "none")
  NONE,

  /**
   * The Disabled flag for a publisher means the publisher can't be changed and won't be used by
   * consumers, this extends to extensions owned by the publisher as well. The disabled flag is managed
   * by the service and can't be supplied by the Extension Developers.
   */
  @Json(name = "disabled")
  DISABLED,

  /**
   * A verified publisher is one that Microsoft has done some review of and ensured the publisher
   * meets a set of requirements. The requirements to become a verified publisher are not listed here. 
   * They can be found in public documentation (TBD).
   */
  @Json(name = "verified")
  VERIFIED,

  /**
   * A Certified publisher is one that is Microsoft verified and in addition meets a set of
   * requirements for its published extensions. The requirements to become a certified publisher are
   * not listed here.  They can be found in public documentation (TBD).
   */
  @Json(name = "certified")
  CERTIFIED,

  /**
   * This is the set of flags that can't be supplied by the developer and is managed by the service
   * itself.
   */
  @Json(name = "serviceFlags")
  SERVICE_FLAGS
}
