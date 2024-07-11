package com.ordersmanagement.crm.models.keys;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCEKey is a Querydsl query type for CEKey
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QCEKey extends BeanPath<CEKey> {

    private static final long serialVersionUID = -30413666L;

    public static final QCEKey cEKey = new QCEKey("cEKey");

    public final NumberPath<Integer> customerId = createNumber("customerId", Integer.class);

    public final NumberPath<Integer> entrepreneurId = createNumber("entrepreneurId", Integer.class);

    public QCEKey(String variable) {
        super(CEKey.class, forVariable(variable));
    }

    public QCEKey(Path<? extends CEKey> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCEKey(PathMetadata metadata) {
        super(CEKey.class, metadata);
    }

}

