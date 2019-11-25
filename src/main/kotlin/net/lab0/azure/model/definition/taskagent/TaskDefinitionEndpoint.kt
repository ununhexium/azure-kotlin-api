package net.lab0.azure.model.definition.taskagent

import kotlin.String

interface TaskDefinitionEndpoint {
  /**
   * An ID that identifies a service connection to be used for authenticating endpoint requests.
   */
  val connectionId: String

  /**
   * An Json based keyselector to filter response returned by fetching the endpoint <c>Url</c>.A
   * Json based keyselector must be prefixed with "jsonpath:". KeySelector can be used to specify the
   * filter to get the keys for the values specified with Selector. <example> The following keyselector
   * defines an Json for extracting nodes named 'ServiceName'. <code> endpoint.KeySelector =
   * "jsonpath://ServiceName"; </code></example>
   */
  val keySelector: String

  /**
   * The scope as understood by Connected Services. Essentialy, a project-id for now.
   */
  val scope: String

  /**
   * An XPath/Json based selector to filter response returned by fetching the endpoint <c>Url</c>.
   * An XPath based selector must be prefixed with the string "xpath:". A Json based selector must be
   * prefixed with "jsonpath:". <example> The following selector defines an XPath for extracting nodes
   * named 'ServiceName'. <code> endpoint.Selector = "xpath://ServiceName"; </code></example>
   */
  val selector: String

  /**
   * TaskId that this endpoint belongs to.
   */
  val taskId: String

  /**
   * URL to GET.
   */
  val url: String
}
