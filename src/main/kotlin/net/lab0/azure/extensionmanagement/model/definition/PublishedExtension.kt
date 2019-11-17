package net.lab0.azure.extensionmanagement.model.definition

import kotlin.String
import kotlin.collections.List
import net.lab0.azure.extensionmanagement.model.definition.enumeration.ExtensionDeploymentTechnology
import net.lab0.azure.extensionmanagement.model.definition.enumeration.PublishedExtensionFlags

interface PublishedExtension {
  val categories: List<String>

  val deploymentType: ExtensionDeploymentTechnology

  val displayName: String

  val extensionId: String

  val extensionName: String

  val flags: PublishedExtensionFlags

  val installationTargets: List<InstallationTarget>

  val lastUpdated: String

  val longDescription: String

  /**
   * Date on which the extension was first uploaded.
   */
  val publishedDate: String

  val publisher: PublisherFacts

  /**
   * Date on which the extension first went public.
   */
  val releaseDate: String

  val sharedWith: List<ExtensionShare>

  val shortDescription: String

  val statistics: List<ExtensionStatistic>

  val tags: List<String>

  val versions: List<ExtensionVersion>
}
