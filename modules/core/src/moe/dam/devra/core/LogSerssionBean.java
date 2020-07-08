package moe.dam.devra.core;

import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.security.app.Authenticated;
import com.haulmont.cuba.security.app.Authentication;
import com.haulmont.cuba.security.app.UserSessionService;
import com.haulmont.cuba.security.entity.UserSessionEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.concurrent.*;

@Component(LogSerssionBean.NAME)
public class LogSerssionBean {
    public static final String NAME = "devra_LogSerssionBean";

    ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

    private static final Logger log = LoggerFactory.getLogger(LogSerssionBean.class);
    @Inject
    UserSessionSource sessionSource;
    @Inject
    UserSessionService userSessionService;
    @Inject
    Authentication authentication;

    @Authenticated
    @PostConstruct
    void init() throws ExecutionException, InterruptedException {
        log.debug("LogSerssionBean PostConstructing...");
        ScheduledFuture<?> handler = executorService.scheduleAtFixedRate(() -> {
            log.debug("LogSerssionBean sessions printing...");
            try {
                authentication.begin();
                for (UserSessionEntity session : userSessionService.loadUserSessionEntities(UserSessionService.Filter.ALL)) {
                    log.debug(String.format("current sessions: %s ", session.toString()));
                }
                authentication.end();
            } catch (Exception e) {
                log.error("执行错误", e);
            }
            log.debug("LogSerssionBean sessions printed");
        },1, 1, TimeUnit.MINUTES);

//        try {
////            handler.get();
////        } catch (ExecutionException e) {
////            log.error("执行错误", e);
////            throw new RuntimeException("执行错误");
////        }
        log.debug("LogSerssionBean PostConstructed");
    }
}