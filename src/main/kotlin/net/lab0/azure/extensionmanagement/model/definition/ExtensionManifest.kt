package net.lab0.azure.extensionmanagement.model.definition

import javax.json.JsonNumber
import kotlin.String
import kotlin.collections.List

/**
 * Base class for extension properties which are shared by the extension manifest and the extension
 * model
 */
interface ExtensionManifest {
  /**
   * Uri used as base for other relative uri's defined in extension
   */
  val baseUri: String

  /**
   * List of shared constraints defined by this extension
   */
  val constraints: List<ContributionConstraint>

  /**
   * List of contributions made by this extension
   */
  val contributions: List<Contribution>

  /**
   * List of contribution types defined by this extension
   */
  val contributionTypes: List<ContributionType>

  /**
   * List of explicit demands required by this extension
   */
  val demands: List<String>

  val eventCallbacks: ExtensionEventCallbackCollection

  /**
   * Secondary location that can be used as base for other relative uri's defined in extension
   */
  val fallbackBaseUri: String

  /**
   * Language Culture Name set by the Gallery
   */
  val language: String

  val licensing: ExtensionLicensing

  /**
   * Version of the extension manifest format/content
   */
  val manifestVersion: JsonNumber

  /**
   * Default user claims applied to all contributions (except the ones which have been speficied
   * restrictedTo explicitly) to control the visibility of a contribution.
   */
  val restrictedTo: List<String>

  /**
   * List of all oauth scopes required by this extension
   */
  val scopes: List<String>

  /**
   * The ServiceInstanceType(Guid) of the VSTS service that must be available to an account in order
   * for the extension to be installed
   */
  val serviceInstanceType: String
}
