package net.lab0.azure.security.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * Class for describing the details of a TeamFoundationSecurityNamespace.
 */
interface SecurityNamespaceDescription {
  /**
   * The list of actions that this Security Namespace is responsible for securing.
   */
  val actions: List<ActionDefinition>

  /**
   * This is the dataspace category that describes where the security information for this
   * SecurityNamespace should be stored.
   */
  val dataspaceCategory: String

  /**
   * This localized name for this namespace.
   */
  val displayName: String

  /**
   * If the security tokens this namespace will be operating on need to be split on certain
   * character lengths to determine its elements, that length should be specified here. If not, this
   * value will be -1.
   */
  val elementLength: Int

  /**
   * This is the type of the extension that should be loaded from the plugins directory for
   * extending this security namespace.
   */
  val extensionType: String

  /**
   * If true, the security namespace is remotable, allowing another service to proxy the namespace.
   */
  val isRemotable: Boolean

  /**
   * This non-localized for this namespace.
   */
  val name: String

  /**
   * The unique identifier for this namespace.
   */
  val namespaceId: String

  /**
   * The permission bits needed by a user in order to read security data on the Security Namespace.
   */
  val readPermission: Int

  /**
   * If the security tokens this namespace will be operating on need to be split on certain
   * characters to determine its elements that character should be specified here. If not, this value
   * will be the null character.
   */
  val separatorValue: String

  /**
   * Used to send information about the structure of the security namespace over the web service.
   */
  val structureValue: Int

  /**
   * The bits reserved by system store
   */
  val systemBitMask: Int

  /**
   * If true, the security service will expect an ISecurityDataspaceTokenTranslator plugin to exist
   * for this namespace
   */
  val useTokenTranslator: Boolean

  /**
   * The permission bits needed by a user in order to modify security data on the Security
   * Namespace.
   */
  val writePermission: Int
}
