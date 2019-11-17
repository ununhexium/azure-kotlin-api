package net.lab0.azure.notification.model.definition.enumeration

import com.squareup.moshi.Json

enum class NotificationOperation {
  @Json(name = "none")
  NONE,

  @Json(name = "suspendUnprocessed")
  SUSPEND_UNPROCESSED
}
