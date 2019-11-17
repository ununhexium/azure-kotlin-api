package net.lab0.azure.servicehooks.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.servicehooks.model.definition.InputValuesQuery
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface PublisherInputValuesQueryApi {
  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @POST("/{organization}/_apis/hooks/publishers/{publisherId}/inputValuesQuery")
  fun queryInputValues(
    @Path("organization") organization: String,
    @Path("publisherId") publisherId: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: InputValuesQuery
  ): Call<JsonValue>
}
