package com.angeltravieso.accounts.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {
    /**
     * Returns the current auditor for the auditing process.
     *
     * @return an Optional containing the name of the current auditor,
     *         which is "ACCOUNT_MS".
     */

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("ACCOUNT_MS");
    }
}
