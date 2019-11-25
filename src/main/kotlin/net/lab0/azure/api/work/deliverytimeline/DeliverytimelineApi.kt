package net.lab0.azure.api.work.deliverytimeline

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface DeliverytimelineApi {
  /**
   * Get Delivery View Data
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param id Identifier for delivery view
   * @param revision Revision of the plan for which you want data. If the current plan is a
   * different revision you will get an ViewRevisionMismatchException exception. If you do not supply a
   * revision you will get data for the latest revision.
   * @param startDate The start date of timeline
   * @param endDate The end date of timeline
   */
  @GET("/{organization}/{project}/_apis/work/plans/{id}/deliverytimeline")
  fun getDeliveryTimelineData(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("id") id: String,
    @Query("revision") revision: Int? = null,
    @Query("startDate") startDate: String? = null,
    @Query("endDate") endDate: String? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
