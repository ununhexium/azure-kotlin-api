package net.lab0.azure.model.definition.work

/**
 * Base class for WIT REST resources.
 */
interface WorkItemTrackingResource : WorkItemTrackingResourceReference {
  val _links: ReferenceLinks
}
