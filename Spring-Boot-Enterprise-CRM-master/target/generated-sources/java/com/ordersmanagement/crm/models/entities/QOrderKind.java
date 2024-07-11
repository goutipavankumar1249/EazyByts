package com.ordersmanagement.crm.models.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QOrderKind is a Querydsl query type for OrderKind
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QOrderKind extends EntityPathBase<OrderKind> {

    private static final long serialVersionUID = 2078433648L;

    public static final QOrderKind orderKind = new QOrderKind("orderKind");

    public final NumberPath<Integer> height = createNumber("height", Integer.class);

    public final NumberPath<Integer> kindId = createNumber("kindId", Integer.class);

    public final StringPath kindName = createString("kindName");

    public final NumberPath<Integer> typeId = createNumber("typeId", Integer.class);

    public final NumberPath<Integer> width = createNumber("width", Integer.class);

    public QOrderKind(String variable) {
        super(OrderKind.class, forVariable(variable));
    }

    public QOrderKind(Path<? extends OrderKind> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOrderKind(PathMetadata metadata) {
        super(OrderKind.class, metadata);
    }

}

