package net.lab0.azure.model.definition.serviceendpoint

interface ServiceEndpointRequest {
  val dataSourceDetails: DataSourceDetails

  val resultTransformationDetails: ResultTransformationDetails

  val serviceEndpointDetails: ServiceEndpointDetails
}
