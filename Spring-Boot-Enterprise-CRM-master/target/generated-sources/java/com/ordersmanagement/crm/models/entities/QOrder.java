package com.ordersmanagement.crm.models.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrder is a Querydsl query type for Order
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QOrder extends EntityPathBase<Order> {

    private static final long serialVersionUID = 594866108L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrder order = new QOrder("order1");

    public final NumberPath<Integer> amount = createNumber("amount", Integer.class);

    public final NumberPath<Integer> billNo = createNumber("billNo", Integer.class);

    public final StringPath comment = createString("comment");

    public final QCustomer customer;

    public final DateTimePath<java.time.LocalDateTime> date = createDateTime("date", java.time.LocalDateTime.class);

    public final QEmployee employee;

    public final QEntrepreneur entrepreneur;

    public final NumberPath<Integer> fees = createNumber("fees", Integer.class);

    public final NumberPath<Integer> finalSum = createNumber("finalSum", Integer.class);

    public final NumberPath<Integer> height = createNumber("height", Integer.class);

    public final NumberPath<Double> m2 = createNumber("m2", Double.class);

    public final NumberPath<Integer> orderId = createNumber("orderId", Integer.class);

    public final QOrderKind orderKind;

    public final QOrderType orderType;

    public final DateTimePath<java.time.LocalDateTime> payDate = createDateTime("payDate", java.time.LocalDateTime.class);

    public final StringPath payLog = createString("payLog");

    public final NumberPath<Integer> paySum = createNumber("paySum", Integer.class);

    public final NumberPath<Double> price = createNumber("price", Double.class);

    public final QStatus status;

    public final NumberPath<Integer> width = createNumber("width", Integer.class);

    public QOrder(String variable) {
        this(Order.class, forVariable(variable), INITS);
    }

    public QOrder(Path<? extends Order> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrder(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrder(PathMetadata metadata, PathInits inits) {
        this(Order.class, metadata, inits);
    }

    public QOrder(Class<? extends Order> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer")) : null;
        this.employee = inits.isInitialized("employee") ? new QEmployee(forProperty("employee")) : null;
        this.entrepreneur = inits.isInitialized("entrepreneur") ? new QEntrepreneur(forProperty("entrepreneur")) : null;
        this.orderKind = inits.isInitialized("orderKind") ? new QOrderKind(forProperty("orderKind")) : null;
        this.orderType = inits.isInitialized("orderType") ? new QOrderType(forProperty("orderType")) : null;
        this.status = inits.isInitialized("status") ? new QStatus(forProperty("status")) : null;
    }

}

