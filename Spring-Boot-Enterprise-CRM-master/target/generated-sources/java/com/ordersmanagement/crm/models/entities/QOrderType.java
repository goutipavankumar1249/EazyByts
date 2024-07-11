package com.ordersmanagement.crm.models.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderType is a Querydsl query type for OrderType
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QOrderType extends EntityPathBase<OrderType> {

    private static final long serialVersionUID = 2078717206L;

    public static final QOrderType orderType = new QOrderType("orderType");

    public final ListPath<OrderKind, QOrderKind> orderKinds = this.<OrderKind, QOrderKind>createList("orderKinds", OrderKind.class, QOrderKind.class, PathInits.DIRECT2);

    public final NumberPath<Integer> typeId = createNumber("typeId", Integer.class);

    public final StringPath typeName = createString("typeName");

    public QOrderType(String variable) {
        super(OrderType.class, forVariable(variable));
    }

    public QOrderType(Path<? extends OrderType> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOrderType(PathMetadata metadata) {
        super(OrderType.class, metadata);
    }

}

