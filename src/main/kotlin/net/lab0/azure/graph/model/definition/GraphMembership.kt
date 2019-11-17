package net.lab0.azure.graph.model.definition

import kotlin.String

/**
 * Relationship between a container and a member
 */
interface GraphMembership {
  val _links: ReferenceLinks

  val containerDescriptor: String

  val memberDescriptor: String
}
