package com.ordersmanagement.crm.models.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUser32 is a Querydsl query type for User32
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUser32 extends EntityPathBase<User32> {

    private static final long serialVersionUID = 1433718972L;

    public static final QUser32 user32 = new QUser32("user32");

    public final NumberPath<Integer> customerID = createNumber("customerID", Integer.class);

    public final StringPath fullName = createString("fullName");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath password = createString("password");

    public final SetPath<Role, QRole> roles = this.<Role, QRole>createSet("roles", Role.class, QRole.class, PathInits.DIRECT2);

    public final StringPath username = createString("username");

    public QUser32(String variable) {
        super(User32.class, forVariable(variable));
    }

    public QUser32(Path<? extends User32> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser32(PathMetadata metadata) {
        super(User32.class, metadata);
    }

}

