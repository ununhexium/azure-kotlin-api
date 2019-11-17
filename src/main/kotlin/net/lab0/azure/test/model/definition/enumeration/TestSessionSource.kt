package net.lab0.azure.test.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Source of the test session
 */
enum class TestSessionSource {
  /**
   * Source of test session uncertain as it is stale
   */
  @Json(name = "unknown")
  UNKNOWN,

  /**
   * The session was created from Microsoft Test Manager exploratory desktop tool.
   */
  @Json(name = "xTDesktop")
  X_T_DESKTOP,

  /**
   * The session was created from feedback client.
   */
  @Json(name = "feedbackDesktop")
  FEEDBACK_DESKTOP,

  /**
   * The session was created from browser extension.
   */
  @Json(name = "xTWeb")
  X_T_WEB,

  /**
   * The session was created from browser extension.
   */
  @Json(name = "feedbackWeb")
  FEEDBACK_WEB,

  /**
   * The session was created from web access using Microsoft Test Manager exploratory desktop tool.
   */
  @Json(name = "xTDesktop2")
  X_T_DESKTOP2,

  /**
   * To show sessions from all supported sources.
   */
  @Json(name = "sessionInsightsForAll")
  SESSION_INSIGHTS_FOR_ALL
}
