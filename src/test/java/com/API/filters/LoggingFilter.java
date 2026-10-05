package com.API.filters;

import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.restassured.filter.Filter;

public class LoggingFilter implements Filter
{
    private static final Logger logger = LogManager.getLogger(LoggingFilter.class);

    @Override
    public Response filter (FilterableRequestSpecification requestspec, FilterableResponseSpecification responcespec,
                            FilterContext ctx)
    {
      logRequest(requestspec);
      Response response = ctx.next(requestspec,responcespec);
      logResponce(response);

      return response;
    }

    public void logRequest(FilterableRequestSpecification requestspec) {
        logger.info("BASE URI:" + requestspec.getBaseUri());
        logger.info("Request header:" + requestspec.getHeaders());
        logger.info("Request Payload:" + requestspec.getBody());
    }

    public void logResponce(Response response) {
        logger.info("STATUS CODE:" + response.getStatusCode());
        logger.info("Responce Header:" + response.getHeaders());
        logger.info("Responce Body:" +  response.getBody());
    }

}
