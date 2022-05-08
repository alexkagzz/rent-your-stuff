package com.kagzz.jmix.rys.app.entity;

import io.jmix.core.annotation.TenantId;
import io.jmix.core.entity.annotation.SystemLevel;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@JmixEntity(name = "rys_StandardTenantEntity")
@MappedSuperclass
public class StandardTenantEntity extends StandardEntity {

    @TenantId
    @SystemLevel
    @Column(name = "TENANT")
    private String tenant;

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }
}