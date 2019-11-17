package net.lab0.azure.release.model.definition

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.release.model.definition.enumeration.ReleaseDefinitionSource

interface ReleaseDefinition : ReleaseDefinitionShallowReference {
  /**
   * Gets or sets the list of artifacts.
   */
  val artifacts: List<Artifact>

  /**
   * Gets or sets comment.
   */
  val comment: String

  val createdBy: IdentityRef

  /**
   * Gets date on which it got created.
   */
  val createdOn: String

  /**
   * Gets or sets the description.
   */
  val description: String

  /**
   * Gets or sets the list of environments.
   */
  val environments: List<ReleaseDefinitionEnvironment>

  /**
   * Whether release definition is deleted.
   */
  val isDeleted: Boolean

  val lastRelease: ReleaseReference

  val modifiedBy: IdentityRef

  /**
   * Gets date on which it got modified.
   */
  val modifiedOn: String

  val properties: PropertiesCollection

  /**
   * Gets or sets the release name format.
   */
  val releaseNameFormat: String

  /**
   * Gets the revision number.
   */
  val revision: Int

  /**
   * Gets or sets source of release definition.
   */
  val source: ReleaseDefinitionSource

  /**
   * Gets or sets list of tags.
   */
  val tags: List<String>

  /**
   * Gets or sets the list of triggers.
   */
  val triggers: List<ReleaseTriggerBase>

  /**
   * Gets or sets the list of variable groups.
   */
  val variableGroups: List<Int>

  /**
   * Gets or sets the dictionary of variables.
   */
  val variables: JsonObject
}
