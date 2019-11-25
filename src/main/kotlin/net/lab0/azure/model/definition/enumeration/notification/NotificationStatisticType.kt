package net.lab0.azure.model.definition.enumeration.notification

import com.squareup.moshi.Json

enum class NotificationStatisticType {
  @Json(name = "notificationBySubscription")
  NOTIFICATION_BY_SUBSCRIPTION,

  @Json(name = "eventsByEventType")
  EVENTS_BY_EVENT_TYPE,

  @Json(name = "notificationByEventType")
  NOTIFICATION_BY_EVENT_TYPE,

  @Json(name = "eventsByEventTypePerUser")
  EVENTS_BY_EVENT_TYPE_PER_USER,

  @Json(name = "notificationByEventTypePerUser")
  NOTIFICATION_BY_EVENT_TYPE_PER_USER,

  @Json(name = "events")
  EVENTS,

  @Json(name = "notifications")
  NOTIFICATIONS,

  @Json(name = "notificationFailureBySubscription")
  NOTIFICATION_FAILURE_BY_SUBSCRIPTION,

  @Json(name = "unprocessedRangeStart")
  UNPROCESSED_RANGE_START,

  @Json(name = "unprocessedEventsByPublisher")
  UNPROCESSED_EVENTS_BY_PUBLISHER,

  @Json(name = "unprocessedEventDelayByPublisher")
  UNPROCESSED_EVENT_DELAY_BY_PUBLISHER,

  @Json(name = "unprocessedNotificationsByChannelByPublisher")
  UNPROCESSED_NOTIFICATIONS_BY_CHANNEL_BY_PUBLISHER,

  @Json(name = "unprocessedNotificationDelayByChannelByPublisher")
  UNPROCESSED_NOTIFICATION_DELAY_BY_CHANNEL_BY_PUBLISHER,

  @Json(name = "delayRangeStart")
  DELAY_RANGE_START,

  @Json(name = "totalPipelineTime")
  TOTAL_PIPELINE_TIME,

  @Json(name = "notificationPipelineTime")
  NOTIFICATION_PIPELINE_TIME,

  @Json(name = "eventPipelineTime")
  EVENT_PIPELINE_TIME,

  @Json(name = "hourlyRangeStart")
  HOURLY_RANGE_START,

  @Json(name = "hourlyNotificationBySubscription")
  HOURLY_NOTIFICATION_BY_SUBSCRIPTION,

  @Json(name = "hourlyEventsByEventTypePerUser")
  HOURLY_EVENTS_BY_EVENT_TYPE_PER_USER,

  @Json(name = "hourlyEvents")
  HOURLY_EVENTS,

  @Json(name = "hourlyNotifications")
  HOURLY_NOTIFICATIONS,

  @Json(name = "hourlyUnprocessedEventsByPublisher")
  HOURLY_UNPROCESSED_EVENTS_BY_PUBLISHER,

  @Json(name = "hourlyUnprocessedEventDelayByPublisher")
  HOURLY_UNPROCESSED_EVENT_DELAY_BY_PUBLISHER,

  @Json(name = "hourlyUnprocessedNotificationsByChannelByPublisher")
  HOURLY_UNPROCESSED_NOTIFICATIONS_BY_CHANNEL_BY_PUBLISHER,

  @Json(name = "hourlyUnprocessedNotificationDelayByChannelByPublisher")
  HOURLY_UNPROCESSED_NOTIFICATION_DELAY_BY_CHANNEL_BY_PUBLISHER,

  @Json(name = "hourlyTotalPipelineTime")
  HOURLY_TOTAL_PIPELINE_TIME,

  @Json(name = "hourlyNotificationPipelineTime")
  HOURLY_NOTIFICATION_PIPELINE_TIME,

  @Json(name = "hourlyEventPipelineTime")
  HOURLY_EVENT_PIPELINE_TIME
}
