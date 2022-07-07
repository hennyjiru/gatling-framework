package com.testingexcellence.scenarios

import com.testingexcellence.config.Config.app_url
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object CreateUserRequest {

  val sentHeaders = Map("Authorization" -> "bearer ${token}")

  val create_user = exec(http("Create User Request")
    .post(app_url + "/users")
    .headers(sentHeaders)
    .formParam("name", "John")
    .formParam("password", "John5P4ss")
    .check(status is 201)
    .check(regex("Created").exists))
}