package com.example.arirangfirst.domains;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAnswers is a Querydsl query type for Answers
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAnswers extends EntityPathBase<Answers> {

    private static final long serialVersionUID = -1705032151L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAnswers answers = new QAnswers("answers");

    public final StringPath answer = createString("answer");

    public final NumberPath<Long> answerId = createNumber("answerId", Long.class);

    public final QQuestions questions;

    public final EnumPath<com.example.arirangfirst.domains.enums.YesNo> rightYn = createEnum("rightYn", com.example.arirangfirst.domains.enums.YesNo.class);

    public final NumberPath<Integer> seq = createNumber("seq", Integer.class);

    public final QTests tests;

    public final EnumPath<com.example.arirangfirst.domains.enums.YesNo> useYn = createEnum("useYn", com.example.arirangfirst.domains.enums.YesNo.class);

    public QAnswers(String variable) {
        this(Answers.class, forVariable(variable), INITS);
    }

    public QAnswers(Path<? extends Answers> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAnswers(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAnswers(PathMetadata metadata, PathInits inits) {
        this(Answers.class, metadata, inits);
    }

    public QAnswers(Class<? extends Answers> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.questions = inits.isInitialized("questions") ? new QQuestions(forProperty("questions"), inits.get("questions")) : null;
        this.tests = inits.isInitialized("tests") ? new QTests(forProperty("tests")) : null;
    }

}

