package net.lab0.azure.git.model.definition

import javax.json.JsonObject
import kotlin.String

/**
 * An object describing the git suggestion.  Git suggestions are currently limited to suggested pull
 * requests.
 */
interface GitSuggestion {
  /**
   * Specific properties describing the suggestion.
   */
  val properties: JsonObject

  /**
   * The type of suggestion (e.g. pull request).
   */
  val type: String
}
