package net.lab0.azure.extensionmanagement.model.definition

import kotlin.String
import kotlin.collections.List

/**
 * Base class shared by contributions and contribution types
 */
interface ContributionBase {
  /**
   * Description of the contribution/type
   */
  val description: String

  /**
   * Fully qualified identifier of the contribution/type
   */
  val id: String

  /**
   * VisibleTo can be used to restrict whom can reference a given contribution/type. This value
   * should be a list of publishers or extensions access is restricted too.  Examples: "ms" - Means
   * only the "ms" publisher can reference this. "ms.vss-web" - Means only the "vss-web" extension from
   * the "ms" publisher can reference this.
   */
  val visibleTo: List<String>
}
