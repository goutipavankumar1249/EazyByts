package com.ordersmanagement.crm.models.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCPLink is a Querydsl query type for CPLink
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCPLink extends EntityPathBase<CPLink> {

    private static final long serialVersionUID = 885319481L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCPLink cPLink = new QCPLink("cPLink");

    public final QCustomer customer;

    public final com.ordersmanagement.crm.models.keys.QCPLinkKey id;

    public final QOrderKind orderKind;

    public final NumberPath<Double> price = createNumber("price", Double.class);

    public QCPLink(String variable) {
        this(CPLink.class, forVariable(variable), INITS);
    }

    public QCPLink(Path<? extends CPLink> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCPLink(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCPLink(PathMetadata metadata, PathInits inits) {
        this(CPLink.class, metadata, inits);
    }

    public QCPLink(Class<? extends CPLink> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer")) : null;
        this.id = inits.isInitialized("id") ? new com.ordersmanagement.crm.models.keys.QCPLinkKey(forProperty("id")) : null;
        this.orderKind = inits.isInitialized("orderKind") ? new QOrderKind(forProperty("orderKind")) : null;
    }

}

