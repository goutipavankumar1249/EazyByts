package com.ordersmanagement.crm.models.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPaymentMethod is a Querydsl query type for PaymentMethod
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPaymentMethod extends EntityPathBase<PaymentMethod> {

    private static final long serialVersionUID = 383905013L;

    public static final QPaymentMethod paymentMethod = new QPaymentMethod("paymentMethod");

    public final NumberPath<Double> paymentPercentage = createNumber("paymentPercentage", Double.class);

    public final NumberPath<Integer> paymentTypeID = createNumber("paymentTypeID", Integer.class);

    public final StringPath typeName = createString("typeName");

    public QPaymentMethod(String variable) {
        super(PaymentMethod.class, forVariable(variable));
    }

    public QPaymentMethod(Path<? extends PaymentMethod> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPaymentMethod(PathMetadata metadata) {
        super(PaymentMethod.class, metadata);
    }

}

