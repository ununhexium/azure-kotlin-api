package net.lab0.azure.api.security.permissionevaluationbatch

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.security.PermissionEvaluationBatch
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface PermissionEvaluationBatchApi {
  /**
   * Evaluates multiple permissions for the calling user.  Note: This method does not aggregate the
   * results, nor does it short-circuit if one of the permissions evaluates to false.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @POST("/{organization}/_apis/security/permissionevaluationbatch")
  fun hasPermissionsBatch(
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: PermissionEvaluationBatch
  ): Call<JsonValue>
}
