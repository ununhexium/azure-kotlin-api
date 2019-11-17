package net.lab0.azure.graph.api

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.HEAD
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface MembershipsApi {
  /**
   * Get a membership relationship between a container and subject.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param subjectDescriptor A descriptor to the child subject in the relationship.
   * @param containerDescriptor A descriptor to the container in the relationship.
   */
  @GET("/{organization}/_apis/graph/memberships/{subjectDescriptor}/{containerDescriptor}")
  fun get(
    @Path("organization") organization: String,
    @Path("subjectDescriptor") subjectDescriptor: String,
    @Path("containerDescriptor") containerDescriptor: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Create a new membership between a container and subject.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param subjectDescriptor A descriptor to a group or user that can be the child subject in the
   * relationship.
   * @param containerDescriptor A descriptor to a group that can be the container in the
   * relationship.
   */
  @PUT("/{organization}/_apis/graph/memberships/{subjectDescriptor}/{containerDescriptor}")
  fun add(
    @Path("organization") organization: String,
    @Path("subjectDescriptor") subjectDescriptor: String,
    @Path("containerDescriptor") containerDescriptor: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Check to see if a membership relationship between a container and subject exists.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param subjectDescriptor The group or user that is a child subject of the relationship.
   * @param containerDescriptor The group that is the container in the relationship.
   */
  @HEAD("/{organization}/_apis/graph/memberships/{subjectDescriptor}/{containerDescriptor}")
  fun checkMembershipExistence(
    @Path("organization") organization: String,
    @Path("subjectDescriptor") subjectDescriptor: String,
    @Path("containerDescriptor") containerDescriptor: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Deletes a membership between a container and subject.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param subjectDescriptor A descriptor to a group or user that is the child subject in the
   * relationship.
   * @param containerDescriptor A descriptor to a group that is the container in the relationship.
   */
  @DELETE("/{organization}/_apis/graph/memberships/{subjectDescriptor}/{containerDescriptor}")
  fun removeMembership(
    @Path("organization") organization: String,
    @Path("subjectDescriptor") subjectDescriptor: String,
    @Path("containerDescriptor") containerDescriptor: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
