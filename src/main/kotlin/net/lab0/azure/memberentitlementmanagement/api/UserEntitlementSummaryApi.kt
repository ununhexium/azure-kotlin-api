package net.lab0.azure.memberentitlementmanagement.api

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface UserEntitlementSummaryApi {
  /**
   * Get summary of Licenses, Extension, Projects, Groups and their assignments in the collection.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param select Comma (",") separated list of properties to select. Supported property names are
   * {AccessLevels, Licenses, Extensions, Projects, Groups}.
   */
  @GET("/{organization}/_apis/userentitlementsummary")
  fun get(
    @Path("organization") organization: String,
    @Query("select") select: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
