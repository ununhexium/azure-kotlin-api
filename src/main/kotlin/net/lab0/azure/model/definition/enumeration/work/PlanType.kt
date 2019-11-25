package net.lab0.azure.model.definition.enumeration.work

import com.squareup.moshi.Json

/**
 * Type of plan to create.
 */
enum class PlanType {
  @Json(name = "deliveryTimelineView")
  DELIVERY_TIMELINE_VIEW
}
