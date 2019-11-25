package net.lab0.azure.model.definition.dashboard

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

/**
 * Contribution based information describing Dashboard Widgets.
 */
interface WidgetMetadata {
  /**
   * Sizes supported by the Widget.
   */
  val allowedSizes: List<WidgetSize>

  /**
   * Opt-in boolean that indicates if the widget requires the Analytics Service to function. Widgets
   * requiring the analytics service are hidden from the catalog if the Analytics Service is not
   * available.
   */
  val analyticsServiceRequired: Boolean

  /**
   * Resource for an icon in the widget catalog.
   */
  val catalogIconUrl: String

  /**
   * Opt-in URL string pointing at widget information. Defaults to extension marketplace URL if
   * omitted
   */
  val catalogInfoUrl: String

  /**
   * The id of the underlying contribution defining the supplied Widget custom configuration UI.
   * Null if custom configuration UI is not available.
   */
  val configurationContributionId: String

  /**
   * The relative id of the underlying contribution defining the supplied Widget custom
   * configuration UI. Null if custom configuration UI is not available.
   */
  val configurationContributionRelativeId: String

  /**
   * Indicates if the widget requires configuration before being added to dashboard.
   */
  val configurationRequired: Boolean

  /**
   * Uri for the widget content to be loaded from .
   */
  val contentUri: String

  /**
   * The id of the underlying contribution defining the supplied Widget.
   */
  val contributionId: String

  /**
   * Optional default settings to be copied into widget settings.
   */
  val defaultSettings: String

  /**
   * Summary information describing the widget.
   */
  val description: String

  /**
   * Widgets can be disabled by the app store.  We'll need to gracefully handle for: - persistence
   * (Allow) - Requests (Tag as disabled, and provide context)
   */
  val isEnabled: Boolean

  /**
   * Opt-out boolean that indicates if the widget supports widget name/title configuration. Widgets
   * ignoring the name should set it to false in the manifest.
   */
  val isNameConfigurable: Boolean

  /**
   * Opt-out boolean indicating if the widget is hidden from the catalog. Commonly, this is used to
   * allow developers to disable creation of a deprecated widget. A widget must have a functional
   * default state, or have a configuration experience, in order to be visible from the catalog.
   */
  val isVisibleFromCatalog: Boolean

  val lightboxOptions: LightboxOptions

  /**
   * Resource for a loading placeholder image on dashboard
   */
  val loadingImageUrl: String

  /**
   * User facing name of the widget type. Each widget must use a unique value here.
   */
  val name: String

  /**
   * Publisher Name of this kind of widget.
   */
  val publisherName: String

  /**
   * Data contract required for the widget to function and to work in its container.
   */
  val supportedScopes: List<JsonObject>

  /**
   * Contribution target IDs
   */
  val targets: List<String>

  /**
   * Deprecated: locally unique developer-facing id of this kind of widget. ContributionId provides
   * a globally unique identifier for widget types.
   */
  val typeId: String
}
