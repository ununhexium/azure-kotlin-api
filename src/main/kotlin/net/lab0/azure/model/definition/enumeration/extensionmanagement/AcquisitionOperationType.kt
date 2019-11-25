package net.lab0.azure.model.definition.enumeration.extensionmanagement

import com.squareup.moshi.Json

/**
 * AcquisitionOperationType: install, request, buy, etc...
 */
enum class AcquisitionOperationType {
  /**
   * Not yet used
   */
  @Json(name = "get")
  GET,

  /**
   * Install this extension into the host provided
   */
  @Json(name = "install")
  INSTALL,

  /**
   * Buy licenses for this extension and install into the host provided
   */
  @Json(name = "buy")
  BUY,

  /**
   * Try this extension
   */
  @Json(name = "try")
  TRY,

  /**
   * Request this extension for installation
   */
  @Json(name = "request")
  REQUEST,

  /**
   * No action found
   */
  @Json(name = "none")
  NONE,

  /**
   * Request admins for purchasing extension
   */
  @Json(name = "purchaseRequest")
  PURCHASE_REQUEST
}
