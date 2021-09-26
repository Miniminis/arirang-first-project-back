package com.example.arirangfirst.domains;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QQuestions is a Querydsl query type for Questions
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QQuestions extends EntityPathBase<Questions> {

    private static final long serialVersionUID = -1334169087L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QQuestions questions = new QQuestions("questions");

    public final ListPath<Answers, QAnswers> answers = this.<Answers, QAnswers>createList("answers", Answers.class, QAnswers.class, PathInits.DIRECT2);

    public final StringPath question = createString("question");

    public final NumberPath<Long> questionId = createNumber("questionId", Long.class);

    public final NumberPath<Integer> seq = createNumber("seq", Integer.class);

    public final StringPath seqText = createString("seqText");

    public final QTests tests;

    public final EnumPath<com.example.arirangfirst.domains.enums.QuestionType> type = createEnum("type", com.example.arirangfirst.domains.enums.QuestionType.class);

    public final EnumPath<com.example.arirangfirst.domains.enums.YesNo> useYn = createEnum("useYn", com.example.arirangfirst.domains.enums.YesNo.class);

    public QQuestions(String variable) {
        this(Questions.class, forVariable(variable), INITS);
    }

    public QQuestions(Path<? extends Questions> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QQuestions(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QQuestions(PathMetadata metadata, PathInits inits) {
        this(Questions.class, metadata, inits);
    }

    public QQuestions(Class<? extends Questions> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.tests = inits.isInitialized("tests") ? new QTests(forProperty("tests")) : null;
    }

}

