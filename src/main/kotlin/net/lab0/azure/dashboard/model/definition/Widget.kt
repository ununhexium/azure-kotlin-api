package net.lab0.azure.dashboard.model.definition

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

/**
 * Widget data
 */
interface Widget {
  val _links: ReferenceLinks

  /**
   * Refers to the allowed sizes for the widget. This gets populated when user wants to configure
   * the widget
   */
  val allowedSizes: List<WidgetSize>

  /**
   * Read-Only Property from Dashboard Service. Indicates if settings are blocked for the current
   * user.
   */
  val areSettingsBlockedForUser: Boolean

  /**
   * Refers to unique identifier of a feature artifact. Used for pinning+unpinning a specific
   * artifact.
   */
  val artifactId: String

  val configurationContributionId: String

  val configurationContributionRelativeId: String

  val contentUri: String

  /**
   * The id of the underlying contribution defining the supplied Widget Configuration.
   */
  val contributionId: String

  val dashboard: Dashboard

  val eTag: String

  val id: String

  val isEnabled: Boolean

  val isNameConfigurable: Boolean

  val lightboxOptions: LightboxOptions

  val loadingImageUrl: String

  val name: String

  val position: WidgetPosition

  val settings: String

  val settingsVersion: SemanticVersion

  val size: WidgetSize

  val typeId: String

  val url: String
}
