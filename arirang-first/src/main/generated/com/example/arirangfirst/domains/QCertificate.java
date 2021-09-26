package com.example.arirangfirst.domains;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCertificate is a Querydsl query type for Certificate
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCertificate extends EntityPathBase<Certificate> {

    private static final long serialVersionUID = -1248144053L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCertificate certificate = new QCertificate("certificate");

    public final NumberPath<Long> certificateId = createNumber("certificateId", Long.class);

    public final StringPath content = createString("content");

    public final StringPath imgUrl = createString("imgUrl");

    public final NumberPath<Integer> level = createNumber("level", Integer.class);

    public final NumberPath<Float> passRate = createNumber("passRate", Float.class);

    public final ListPath<Result, QResult> results = this.<Result, QResult>createList("results", Result.class, QResult.class, PathInits.DIRECT2);

    public final NumberPath<Integer> standardCnt = createNumber("standardCnt", Integer.class);

    public final QTests tests;

    public final StringPath title = createString("title");

    public QCertificate(String variable) {
        this(Certificate.class, forVariable(variable), INITS);
    }

    public QCertificate(Path<? extends Certificate> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCertificate(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCertificate(PathMetadata metadata, PathInits inits) {
        this(Certificate.class, metadata, inits);
    }

    public QCertificate(Class<? extends Certificate> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.tests = inits.isInitialized("tests") ? new QTests(forProperty("tests")) : null;
    }

}

