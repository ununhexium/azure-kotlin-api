package net.lab0.azure.model.definition.release

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.release.ReleaseReason
import net.lab0.azure.model.definition.enumeration.release.ReleaseStatus

interface Release {
  val _links: ReferenceLinks

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
   * Gets revision number of definition snapshot.
   */
  val definitionSnapshotRevision: Int

  /**
   * Gets or sets description of release.
   */
  val description: String

  /**
   * Gets list of environments.
   */
  val environments: List<ReleaseEnvironment>

  /**
   * Gets the unique identifier of this field.
   */
  val id: Int

  /**
   * Whether to exclude the release from retention policies.
   */
  val keepForever: Boolean

  /**
   * Gets logs container url.
   */
  val logsContainerUrl: String

  val modifiedBy: IdentityRef

  /**
   * Gets date on which it got modified.
   */
  val modifiedOn: String

  /**
   * Gets name.
   */
  val name: String

  /**
   * Gets pool name.
   */
  val poolName: String

  val projectReference: ProjectReference

  val properties: PropertiesCollection

  /**
   * Gets reason of release.
   */
  val reason: ReleaseReason

  val releaseDefinition: ReleaseDefinitionShallowReference

  /**
   * Gets release name format.
   */
  val releaseNameFormat: String

  /**
   * Gets status.
   */
  val status: ReleaseStatus

  /**
   * Gets or sets list of tags.
   */
  val tags: List<String>

  val triggeringArtifactAlias: String

  /**
   * Gets the list of variable groups.
   */
  val variableGroups: List<VariableGroup>

  /**
   * Gets or sets the dictionary of variables.
   */
  val variables: JsonObject
}
