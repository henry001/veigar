package io.github.watertao.veigar.auditlog;

import io.github.watertao.veigar.session.spi.AuthenticationObject;
import io.github.watertao.veigar.session.spi.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.github.watertao.veigar.auditlog.spi.AuditLogger;

public class DefaultAuditLogger implements AuditLogger {

  private static final Logger logger = LoggerFactory.getLogger(DefaultAuditLogger.class);

  @Override
  public void log(
    AuthenticationObject authObj,
    Resource resource,
    String reqVerb,
    String requestUri,
    String remoteIp,
    Object requestBody,
    Object responseBody,
    Throwable e,
    Long cost) {

    logger.warn("Dummy AuditLogger: you should implemented a meaningful AuditLogger");

  }

}
