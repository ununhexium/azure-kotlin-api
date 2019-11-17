package net.lab0.azure.notification.api

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface DiagnosticLogsApi {
  /**
   * List diagnostic logs this service.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/notification/diagnosticlogs/{source}/entries/{entryId}")
  fun list(
    @Path("source") source: String,
    @Path("organization") organization: String,
    @Path("entryId") entryId: String,
    @Query("startTime") startTime: String,
    @Query("endTime") endTime: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
