package net.lab0.azure.taskagent.model.definition

interface ServiceEndpointRequest {
  val dataSourceDetails: DataSourceDetails

  val resultTransformationDetails: ResultTransformationDetails

  val serviceEndpointDetails: ServiceEndpointDetails
}
