package net.lab0.azure.work.model.definition

import javax.json.JsonObject
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.work.model.definition.enumeration.BugsBehavior

/**
 * Data contract for TeamSettings
 */
interface TeamSetting : TeamSettingsDataContractBase {
  val backlogIteration: TeamSettingsIteration

  /**
   * Information about categories that are visible on the backlog.
   */
  val backlogVisibilities: JsonObject

  /**
   * BugsBehavior (Off, AsTasks, AsRequirements, ...)
   */
  val bugsBehavior: BugsBehavior

  val defaultIteration: TeamSettingsIteration

  /**
   * Default Iteration macro (if any)
   */
  val defaultIterationMacro: String

  /**
   * Days that the team is working
   */
  val workingDays: List<JsonObject>
}
