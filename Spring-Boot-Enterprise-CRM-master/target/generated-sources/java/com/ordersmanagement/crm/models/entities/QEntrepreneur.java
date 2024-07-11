package com.ordersmanagement.crm.models.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEntrepreneur is a Querydsl query type for Entrepreneur
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEntrepreneur extends EntityPathBase<Entrepreneur> {

    private static final long serialVersionUID = 644908395L;

    public static final QEntrepreneur entrepreneur = new QEntrepreneur("entrepreneur");

    public final NumberPath<Integer> entrepreneurId = createNumber("entrepreneurId", Integer.class);

    public final StringPath fullName = createString("fullName");

    public QEntrepreneur(String variable) {
        super(Entrepreneur.class, forVariable(variable));
    }

    public QEntrepreneur(Path<? extends Entrepreneur> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEntrepreneur(PathMetadata metadata) {
        super(Entrepreneur.class, metadata);
    }

}

