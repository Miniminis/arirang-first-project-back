package com.example.arirangfirst.controllers;

import com.example.arirangfirst.networks.BaseResponseEntity;
import com.example.arirangfirst.networks.requests.TestResultReqDto;
import com.example.arirangfirst.networks.responses.CertificateResDto;
import com.example.arirangfirst.networks.responses.QuestionsInfoResDto;
import com.example.arirangfirst.networks.responses.QuestionsResDto;
import com.example.arirangfirst.networks.responses.TestResultResDto;
import com.example.arirangfirst.services.PangTestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
@CrossOrigin
@Slf4j
public class PangTestApiController {

    private final PangTestService pangTestService;


    /**
     * 질문+답변지 조회
     * */
    @GetMapping("/questions")
    public BaseResponseEntity<QuestionsInfoResDto> getQuestions() {
        log.info("test");
        return pangTestService.getQuestionsInfo();
    }


    /**
     * 테스트 결과 저장
     * */
    @PostMapping("/result")
    @Transactional
    public BaseResponseEntity<TestResultResDto> saveResult(@RequestBody @Valid TestResultReqDto testResultReqDto) {
        log.info("req" + testResultReqDto);
        if (testResultReqDto.getAnswerMap().isEmpty()) {
            return BaseResponseEntity.ERROR();
        }
        return pangTestService.saveResult(testResultReqDto);
    }


    /**
     * 테스트 결과 조회 (인증서 조회)
     * */
    @GetMapping("/result/{id}")
    public BaseResponseEntity<CertificateResDto> getCertificate(@PathVariable("id") Long resultId) {
        return pangTestService.getCertificate(resultId);
    }


}
