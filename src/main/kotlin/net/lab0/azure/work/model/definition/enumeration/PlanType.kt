package net.lab0.azure.work.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Type of plan to create.
 */
enum class PlanType {
  @Json(name = "deliveryTimelineView")
  DELIVERY_TIMELINE_VIEW
}
