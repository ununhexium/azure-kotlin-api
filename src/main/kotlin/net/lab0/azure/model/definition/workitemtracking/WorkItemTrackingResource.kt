package net.lab0.azure.model.definition.workitemtracking

/**
 * Base class for WIT REST resources.
 */
interface WorkItemTrackingResource : WorkItemTrackingResourceReference {
  val _links: ReferenceLinks
}
