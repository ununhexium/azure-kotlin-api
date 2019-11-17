package net.lab0.azure.extensionmanagement.model.definition.enumeration

import com.squareup.moshi.Json

enum class PublishedExtensionFlags {
  /**
   * No flags exist for this extension.
   */
  @Json(name = "none")
  NONE,

  /**
   * The Disabled flag for an extension means the extension can't be changed and won't be used by
   * consumers. The disabled flag is managed by the service and can't be supplied by the Extension
   * Developers.
   */
  @Json(name = "disabled")
  DISABLED,

  /**
   * BuiltIn Extension are available to all Tenants. An explicit registration is not required. This
   * attribute is reserved and can't be supplied by Extension Developers.  BuiltIn extensions are by
   * definition Public. There is no need to set the public flag for extensions marked BuiltIn.
   */
  @Json(name = "builtIn")
  BUILT_IN,

  /**
   * This extension has been validated by the service. The extension meets the requirements
   * specified. This attribute is reserved and can't be supplied by the Extension Developers.
   * Validation is a process that ensures that all contributions are well formed. They meet the
   * requirements defined by the contribution type they are extending. Note this attribute will be
   * updated asynchronously as the extension is validated by the developer of the contribution type.
   * There will be restricted access to the extension while this process is performed.
   */
  @Json(name = "validated")
  VALIDATED,

  /**
   * Trusted extensions are ones that are given special capabilities. These tend to come from
   * Microsoft and can't be published by the general public.  Note: BuiltIn extensions are always
   * trusted.
   */
  @Json(name = "trusted")
  TRUSTED,

  /**
   * The Paid flag indicates that the commerce can be enabled for this extension. Publisher needs to
   * setup Offer/Pricing plan in Azure. If Paid flag is set and a corresponding Offer is not available,
   * the extension will automatically be marked as Preview. If the publisher intends to make the
   * extension Paid in the future, it is mandatory to set the Preview flag. This is currently available
   * only for VSTS extensions only.
   */
  @Json(name = "paid")
  PAID,

  /**
   * This extension registration is public, making its visibilty open to the public. This means all
   * tenants have the ability to install this extension. Without this flag the extension will be
   * private and will need to be shared with the tenants that can install it.
   */
  @Json(name = "public")
  PUBLIC,

  /**
   * This extension has multiple versions active at one time and version discovery should be done
   * usig the defined "Version Discovery" protocol to determine the version available to a specific
   * user or tenant.  @TODO: Link to Version Discovery Protocol.
   */
  @Json(name = "multiVersion")
  MULTI_VERSION,

  /**
   * The system flag is reserved, and cant be used by publishers.
   */
  @Json(name = "system")
  SYSTEM,

  /**
   * The Preview flag indicates that the extension is still under preview (not yet of "release"
   * quality). These extensions may be decorated differently in the gallery and may have different
   * policies applied to them.
   */
  @Json(name = "preview")
  PREVIEW,

  /**
   * The Unpublished flag indicates that the extension can't be installed/downloaded. Users who have
   * installed such an extension can continue to use the extension.
   */
  @Json(name = "unpublished")
  UNPUBLISHED,

  /**
   * The Trial flag indicates that the extension is in Trial version. The flag is right now being
   * used only with respec to Visual Studio extensions.
   */
  @Json(name = "trial")
  TRIAL,

  /**
   * The Locked flag indicates that extension has been locked from Marketplace. Further
   * updates/acquisitions are not allowed on the extension until this is present. This should be used
   * along with making the extension private/unpublished.
   */
  @Json(name = "locked")
  LOCKED,

  /**
   * This flag is set for extensions we want to hide from Marketplace home and search pages. This
   * will be used to override the exposure of builtIn flags.
   */
  @Json(name = "hidden")
  HIDDEN
}
