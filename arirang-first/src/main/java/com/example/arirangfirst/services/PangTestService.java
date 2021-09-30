package com.example.arirangfirst.services;

import com.example.arirangfirst.domains.Certificate;
import com.example.arirangfirst.domains.Result;
import com.example.arirangfirst.domains.Tests;
import com.example.arirangfirst.networks.BaseResponseEntity;
import com.example.arirangfirst.networks.requests.TestResultReqDto;
import com.example.arirangfirst.networks.responses.CertificateResDto;
import com.example.arirangfirst.networks.responses.QuestionsInfoResDto;
import com.example.arirangfirst.networks.responses.TestResultResDto;
import com.example.arirangfirst.repositories.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class PangTestService {

    private final QuestionsQueryRepository questionsQueryRepository;
    private final AnswersQueryRepository answersQueryRepository;
    private final TestsQueryRepository testsQueryRepository;
    private final ResultRepository resultRepository;
    private final ResultQueryRepository resultQueryRepository;
    private final CertificateQueryRepository certificateQueryRepository;


    public BaseResponseEntity<QuestionsInfoResDto> getQuestionsInfo() {
        QuestionsInfoResDto resDto = questionsQueryRepository.findQuestionsAndAnswers();
        return BaseResponseEntity.OK(resDto);
    }

    public BaseResponseEntity<TestResultResDto> saveResult(TestResultReqDto testResultReqDto) {
        Long testId = testResultReqDto.getTestId();
        String testerName = testResultReqDto.getTesterName();

        Map<Integer, String> testUserAnswers = testResultReqDto.getAnswerMap();
        Map<Long, String> testRightAnswers = answersQueryRepository.findRightAnswers(testId);

        int totalRightCnt = 0;
        for (Long questionId : testRightAnswers.keySet()) {
            if (testRightAnswers.get(questionId).equals(testUserAnswers.get(questionId.intValue()))) {
                totalRightCnt += 1;
            }
        }

        Certificate certificate = certificateQueryRepository.findCertificate(testId, totalRightCnt);
        Tests test = testsQueryRepository.findSingleTest(testId);

        Result result = Result.builder()
                .tests(test)
                .certificate(certificate)
                .testerName(testerName)
                .totalRightCnt(totalRightCnt)
                .createDate(LocalDate.now())
                .build();
        Result savedResult = resultRepository.save(result);

        Long certificateId = certificate.getCertificateId();
        Float passRate = resultQueryRepository.findCertificatePassRate(certificateId);
        certificateQueryRepository.updatePassRate(certificateId, passRate);

        Long resultId = savedResult.getResultId();

        TestResultResDto testResultResDto = TestResultResDto.builder()
                .resultId(resultId)
                .build();

        return BaseResponseEntity.OK(testResultResDto);
    }

    public BaseResponseEntity<CertificateResDto> getCertificate(Long resultId) {
        CertificateResDto certificateResDto = resultQueryRepository.findSingleResult(resultId);
        return BaseResponseEntity.OK(certificateResDto);
    }

}
