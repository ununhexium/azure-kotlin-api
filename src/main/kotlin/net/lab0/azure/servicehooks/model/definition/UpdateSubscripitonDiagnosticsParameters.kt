package net.lab0.azure.servicehooks.model.definition

interface UpdateSubscripitonDiagnosticsParameters {
  val deliveryResults: UpdateSubscripitonTracingParameters

  val deliveryTracing: UpdateSubscripitonTracingParameters

  val evaluationTracing: UpdateSubscripitonTracingParameters
}
