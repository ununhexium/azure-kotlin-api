package net.lab0.azure.model.definition.enumeration.extensionmanagement

import com.squareup.moshi.Json

/**
 * States of an installed extension
 */
enum class ExtensionStateFlags {
  /**
   * No flags set
   */
  @Json(name = "none")
  NONE,

  /**
   * Extension is disabled
   */
  @Json(name = "disabled")
  DISABLED,

  /**
   * Extension is a built in
   */
  @Json(name = "builtIn")
  BUILT_IN,

  /**
   * Extension has multiple versions
   */
  @Json(name = "multiVersion")
  MULTI_VERSION,

  /**
   * Extension is not installed.  This is for builtin extensions only and can not otherwise be set.
   */
  @Json(name = "unInstalled")
  UN_INSTALLED,

  /**
   * Error performing version check
   */
  @Json(name = "versionCheckError")
  VERSION_CHECK_ERROR,

  /**
   * Trusted extensions are ones that are given special capabilities. These tend to come from
   * Microsoft and can't be published by the general public.  Note: BuiltIn extensions are always
   * trusted.
   */
  @Json(name = "trusted")
  TRUSTED,

  /**
   * Extension is currently in an error state
   */
  @Json(name = "error")
  ERROR,

  /**
   * Extension scopes have changed and the extension requires re-authorization
   */
  @Json(name = "needsReauthorization")
  NEEDS_REAUTHORIZATION,

  /**
   * Error performing auto-upgrade. For example, if the new version has demands not supported the
   * extension cannot be auto-upgraded.
   */
  @Json(name = "autoUpgradeError")
  AUTO_UPGRADE_ERROR,

  /**
   * Extension is currently in a warning state, that can cause a degraded experience. The degraded
   * experience can be caused for example by some installation issues detected such as implicit demands
   * not supported.
   */
  @Json(name = "warning")
  WARNING
}
