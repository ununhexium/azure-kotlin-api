package net.lab0.azure.model.definition.enumeration.notification

import com.squareup.moshi.Json

enum class NotificationOperation {
  @Json(name = "none")
  NONE,

  @Json(name = "suspendUnprocessed")
  SUSPEND_UNPROCESSED
}
