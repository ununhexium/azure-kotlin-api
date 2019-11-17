package net.lab0.azure.servicehooks.model.definition

interface SubscriptionDiagnostics {
  val deliveryResults: SubscriptionTracing

  val deliveryTracing: SubscriptionTracing

  val evaluationTracing: SubscriptionTracing
}
