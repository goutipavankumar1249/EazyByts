package com.ordersmanagement.crm.models.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCustomer is a Querydsl query type for Customer
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCustomer extends EntityPathBase<Customer> {

    private static final long serialVersionUID = -6874960L;

    public static final QCustomer customer = new QCustomer("customer");

    public final StringPath city = createString("city");

    public final StringPath customerGroup = createString("customerGroup");

    public final NumberPath<Integer> customerId = createNumber("customerId", Integer.class);

    public final StringPath customerName = createString("customerName");

    public final StringPath firstEmail = createString("firstEmail");

    public final StringPath firstPerson = createString("firstPerson");

    public final StringPath firstPhone = createString("firstPhone");

    public final StringPath info = createString("info");

    public final BooleanPath isDebtor = createBoolean("isDebtor");

    public final NumberPath<Integer> money = createNumber("money", Integer.class);

    public final StringPath payLog = createString("payLog");

    public final StringPath secondEmail = createString("secondEmail");

    public final StringPath secondPerson = createString("secondPerson");

    public final StringPath secondPhone = createString("secondPhone");

    public final StringPath thirdEmail = createString("thirdEmail");

    public final StringPath thirdPerson = createString("thirdPerson");

    public final StringPath thirdPhone = createString("thirdPhone");

    public QCustomer(String variable) {
        super(Customer.class, forVariable(variable));
    }

    public QCustomer(Path<? extends Customer> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCustomer(PathMetadata metadata) {
        super(Customer.class, metadata);
    }

}

