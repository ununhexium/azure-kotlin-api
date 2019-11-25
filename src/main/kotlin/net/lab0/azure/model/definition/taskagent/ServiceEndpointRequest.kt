package net.lab0.azure.model.definition.taskagent

interface ServiceEndpointRequest {
  val dataSourceDetails: DataSourceDetails

  val resultTransformationDetails: ResultTransformationDetails

  val serviceEndpointDetails: ServiceEndpointDetails
}
