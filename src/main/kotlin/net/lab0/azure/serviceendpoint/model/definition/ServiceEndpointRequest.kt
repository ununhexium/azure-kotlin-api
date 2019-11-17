package net.lab0.azure.serviceendpoint.model.definition

interface ServiceEndpointRequest {
  val dataSourceDetails: DataSourceDetails

  val resultTransformationDetails: ResultTransformationDetails

  val serviceEndpointDetails: ServiceEndpointDetails
}
