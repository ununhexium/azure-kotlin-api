package net.lab0.azure.taskagent.model.definition

import kotlin.String

/**
 * Represents a downloadable package.
 */
interface PackageMetadata {
  /**
   * The date the package was created
   */
  val createdOn: String

  /**
   * A direct link to download the package.
   */
  val downloadUrl: String

  /**
   * The UI uses this to display instructions, i.e. "unzip MyAgent.zip"
   */
  val filename: String

  /**
   * MD5 hash as a base64 string
   */
  val hashValue: String

  /**
   * A link to documentation
   */
  val infoUrl: String

  /**
   * The platform (win7, linux, etc.)
   */
  val platform: String

  /**
   * The type of package (e.g. "agent")
   */
  val type: String

  val version: PackageVersion
}
