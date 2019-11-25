package net.lab0.azure.model.definition.servicehooks

interface SubscriptionDiagnostics {
  val deliveryResults: SubscriptionTracing

  val deliveryTracing: SubscriptionTracing

  val evaluationTracing: SubscriptionTracing
}
