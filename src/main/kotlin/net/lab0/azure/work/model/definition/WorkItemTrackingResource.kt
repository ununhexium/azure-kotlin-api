package net.lab0.azure.work.model.definition

/**
 * Base class for WIT REST resources.
 */
interface WorkItemTrackingResource : WorkItemTrackingResourceReference {
  val _links: ReferenceLinks
}
