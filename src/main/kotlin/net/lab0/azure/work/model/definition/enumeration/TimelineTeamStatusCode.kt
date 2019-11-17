package net.lab0.azure.work.model.definition.enumeration

import com.squareup.moshi.Json

enum class TimelineTeamStatusCode {
  /**
   * No error - all data for team is good.
   */
  @Json(name = "oK")
  O_K,

  /**
   * Team does not exist or access is denied.
   */
  @Json(name = "doesntExistOrAccessDenied")
  DOESNT_EXIST_OR_ACCESS_DENIED,

  /**
   * Maximum number of teams was exceeded. No team data will be returned for this team.
   */
  @Json(name = "maxTeamsExceeded")
  MAX_TEAMS_EXCEEDED,

  /**
   * Maximum number of team fields (ie Area paths) have been exceeded. No team data will be returned
   * for this team.
   */
  @Json(name = "maxTeamFieldsExceeded")
  MAX_TEAM_FIELDS_EXCEEDED,

  /**
   * Backlog does not exist or is missing crucial information.
   */
  @Json(name = "backlogInError")
  BACKLOG_IN_ERROR,

  /**
   * Team field value is not set for this team. No team data will be returned for this team
   */
  @Json(name = "missingTeamFieldValue")
  MISSING_TEAM_FIELD_VALUE,

  /**
   * Team does not have a single iteration with date range.
   */
  @Json(name = "noIterationsExist")
  NO_ITERATIONS_EXIST
}
