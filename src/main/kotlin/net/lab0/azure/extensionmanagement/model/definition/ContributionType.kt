package net.lab0.azure.extensionmanagement.model.definition

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.String

/**
 * A contribution type, given by a json schema
 */
interface ContributionType : ContributionBase {
  /**
   * Controls whether or not contributions of this type have the type indexed for queries. This
   * allows clients to find all extensions that have a contribution of this type.  NOTE: Only
   * TrustedPartners are allowed to specify indexed contribution types.
   */
  val indexed: Boolean

  /**
   * Friendly name of the contribution/type
   */
  val name: String

  /**
   * Describes the allowed properties for this contribution type
   */
  val properties: JsonObject
}
