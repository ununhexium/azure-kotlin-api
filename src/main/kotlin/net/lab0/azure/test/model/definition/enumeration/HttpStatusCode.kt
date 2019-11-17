package net.lab0.azure.test.model.definition.enumeration

import com.squareup.moshi.Json

enum class HttpStatusCode {
  @Json(name = "continue")
  CONTINUE,

  @Json(name = "switchingProtocols")
  SWITCHING_PROTOCOLS,

  @Json(name = "oK")
  O_K,

  @Json(name = "created")
  CREATED,

  @Json(name = "accepted")
  ACCEPTED,

  @Json(name = "nonAuthoritativeInformation")
  NON_AUTHORITATIVE_INFORMATION,

  @Json(name = "noContent")
  NO_CONTENT,

  @Json(name = "resetContent")
  RESET_CONTENT,

  @Json(name = "partialContent")
  PARTIAL_CONTENT,

  @Json(name = "multipleChoices")
  MULTIPLE_CHOICES,

  @Json(name = "ambiguous")
  AMBIGUOUS,

  @Json(name = "movedPermanently")
  MOVED_PERMANENTLY,

  @Json(name = "moved")
  MOVED,

  @Json(name = "found")
  FOUND,

  @Json(name = "redirect")
  REDIRECT,

  @Json(name = "seeOther")
  SEE_OTHER,

  @Json(name = "redirectMethod")
  REDIRECT_METHOD,

  @Json(name = "notModified")
  NOT_MODIFIED,

  @Json(name = "useProxy")
  USE_PROXY,

  @Json(name = "unused")
  UNUSED,

  @Json(name = "temporaryRedirect")
  TEMPORARY_REDIRECT,

  @Json(name = "redirectKeepVerb")
  REDIRECT_KEEP_VERB,

  @Json(name = "badRequest")
  BAD_REQUEST,

  @Json(name = "unauthorized")
  UNAUTHORIZED,

  @Json(name = "paymentRequired")
  PAYMENT_REQUIRED,

  @Json(name = "forbidden")
  FORBIDDEN,

  @Json(name = "notFound")
  NOT_FOUND,

  @Json(name = "methodNotAllowed")
  METHOD_NOT_ALLOWED,

  @Json(name = "notAcceptable")
  NOT_ACCEPTABLE,

  @Json(name = "proxyAuthenticationRequired")
  PROXY_AUTHENTICATION_REQUIRED,

  @Json(name = "requestTimeout")
  REQUEST_TIMEOUT,

  @Json(name = "conflict")
  CONFLICT,

  @Json(name = "gone")
  GONE,

  @Json(name = "lengthRequired")
  LENGTH_REQUIRED,

  @Json(name = "preconditionFailed")
  PRECONDITION_FAILED,

  @Json(name = "requestEntityTooLarge")
  REQUEST_ENTITY_TOO_LARGE,

  @Json(name = "requestUriTooLong")
  REQUEST_URI_TOO_LONG,

  @Json(name = "unsupportedMediaType")
  UNSUPPORTED_MEDIA_TYPE,

  @Json(name = "requestedRangeNotSatisfiable")
  REQUESTED_RANGE_NOT_SATISFIABLE,

  @Json(name = "expectationFailed")
  EXPECTATION_FAILED,

  @Json(name = "upgradeRequired")
  UPGRADE_REQUIRED,

  @Json(name = "internalServerError")
  INTERNAL_SERVER_ERROR,

  @Json(name = "notImplemented")
  NOT_IMPLEMENTED,

  @Json(name = "badGateway")
  BAD_GATEWAY,

  @Json(name = "serviceUnavailable")
  SERVICE_UNAVAILABLE,

  @Json(name = "gatewayTimeout")
  GATEWAY_TIMEOUT,

  @Json(name = "httpVersionNotSupported")
  HTTP_VERSION_NOT_SUPPORTED
}
