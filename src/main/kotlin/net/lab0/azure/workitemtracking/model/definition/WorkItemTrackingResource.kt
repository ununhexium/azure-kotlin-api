package net.lab0.azure.workitemtracking.model.definition

/**
 * Base class for WIT REST resources.
 */
interface WorkItemTrackingResource : WorkItemTrackingResourceReference {
  val _links: ReferenceLinks
}
