package com.example.arirangfirst.domains;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QResult is a Querydsl query type for Result
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QResult extends EntityPathBase<Result> {

    private static final long serialVersionUID = -823544855L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QResult result = new QResult("result");

    public final QCertificate certificate;

    public final DatePath<java.time.LocalDate> createDate = createDate("createDate", java.time.LocalDate.class);

    public final NumberPath<Long> resultId = createNumber("resultId", Long.class);

    public final StringPath testerName = createString("testerName");

    public final QTests tests;

    public final NumberPath<Integer> totalRightCnt = createNumber("totalRightCnt", Integer.class);

    public QResult(String variable) {
        this(Result.class, forVariable(variable), INITS);
    }

    public QResult(Path<? extends Result> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QResult(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QResult(PathMetadata metadata, PathInits inits) {
        this(Result.class, metadata, inits);
    }

    public QResult(Class<? extends Result> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.certificate = inits.isInitialized("certificate") ? new QCertificate(forProperty("certificate"), inits.get("certificate")) : null;
        this.tests = inits.isInitialized("tests") ? new QTests(forProperty("tests")) : null;
    }

}

