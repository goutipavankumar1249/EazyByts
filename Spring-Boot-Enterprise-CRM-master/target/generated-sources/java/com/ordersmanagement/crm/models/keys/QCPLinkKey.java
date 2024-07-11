package com.ordersmanagement.crm.models.keys;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCPLinkKey is a Querydsl query type for CPLinkKey
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QCPLinkKey extends BeanPath<CPLinkKey> {

    private static final long serialVersionUID = 118079577L;

    public static final QCPLinkKey cPLinkKey = new QCPLinkKey("cPLinkKey");

    public final NumberPath<Integer> customerId = createNumber("customerId", Integer.class);

    public final NumberPath<Integer> kindId = createNumber("kindId", Integer.class);

    public QCPLinkKey(String variable) {
        super(CPLinkKey.class, forVariable(variable));
    }

    public QCPLinkKey(Path<? extends CPLinkKey> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCPLinkKey(PathMetadata metadata) {
        super(CPLinkKey.class, metadata);
    }

}

