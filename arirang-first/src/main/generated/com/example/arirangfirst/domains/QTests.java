package com.example.arirangfirst.domains;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTests is a Querydsl query type for Tests
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTests extends EntityPathBase<Tests> {

    private static final long serialVersionUID = 1914943701L;

    public static final QTests tests = new QTests("tests");

    public final StringPath name = createString("name");

    public final ListPath<Result, QResult> results = this.<Result, QResult>createList("results", Result.class, QResult.class, PathInits.DIRECT2);

    public final NumberPath<Long> testId = createNumber("testId", Long.class);

    public final StringPath testUrl = createString("testUrl");

    public final StringPath thumbnailImgUrl = createString("thumbnailImgUrl");

    public final StringPath type = createString("type");

    public QTests(String variable) {
        super(Tests.class, forVariable(variable));
    }

    public QTests(Path<? extends Tests> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTests(PathMetadata metadata) {
        super(Tests.class, metadata);
    }

}

