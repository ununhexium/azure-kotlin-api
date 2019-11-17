package net.lab0.azure.test.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Test Log Status code
 */
enum class TestLogStatusCode {
  @Json(name = "success")
  SUCCESS,

  @Json(name = "failed")
  FAILED,

  @Json(name = "fileAlreadyExists")
  FILE_ALREADY_EXISTS,

  @Json(name = "invalidInput")
  INVALID_INPUT,

  @Json(name = "invalidFileName")
  INVALID_FILE_NAME,

  @Json(name = "invalidContainer")
  INVALID_CONTAINER,

  @Json(name = "transferFailed")
  TRANSFER_FAILED,

  @Json(name = "featureDisabled")
  FEATURE_DISABLED,

  @Json(name = "buildNotExist")
  BUILD_NOT_EXIST,

  @Json(name = "runNotExist")
  RUN_NOT_EXIST,

  @Json(name = "containerNotCreated")
  CONTAINER_NOT_CREATED,

  @Json(name = "aPINotSupported")
  A_P_I_NOT_SUPPORTED,

  @Json(name = "fileSizeExceed")
  FILE_SIZE_EXCEED
}
