package net.lab0.azure.model.definition.graph

import kotlin.Boolean

/**
 * Status of a Graph membership (active/inactive)
 */
interface GraphMembershipState {
  val _links: ReferenceLinks

  /**
   * When true, the membership is active
   */
  val active: Boolean
}
