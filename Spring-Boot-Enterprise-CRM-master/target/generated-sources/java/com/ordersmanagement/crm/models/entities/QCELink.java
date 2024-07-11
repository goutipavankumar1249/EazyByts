package com.ordersmanagement.crm.models.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCELink is a Querydsl query type for CELink
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCELink extends EntityPathBase<CELink> {

    private static final long serialVersionUID = 875160750L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCELink cELink = new QCELink("cELink");

    public final QCustomer customer;

    public final QEntrepreneur entrepreneur;

    public final com.ordersmanagement.crm.models.keys.QCEKey id;

    public QCELink(String variable) {
        this(CELink.class, forVariable(variable), INITS);
    }

    public QCELink(Path<? extends CELink> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCELink(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCELink(PathMetadata metadata, PathInits inits) {
        this(CELink.class, metadata, inits);
    }

    public QCELink(Class<? extends CELink> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer")) : null;
        this.entrepreneur = inits.isInitialized("entrepreneur") ? new QEntrepreneur(forProperty("entrepreneur")) : null;
        this.id = inits.isInitialized("id") ? new com.ordersmanagement.crm.models.keys.QCEKey(forProperty("id")) : null;
    }

}

