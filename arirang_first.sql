SELECT * FROM arirang_first.question;
-- insert into arirang_first.question values 
--     (0, 1, 'NUMBER', 3, '다음중 서울이 본점인 빵집을 선택해주세요.', 'Y'),
--     (0, 1, 'NUMBER', 4, '다음중 서울에 위치한 빵집을 선택해주세요.', 'Y'),
--     (0, 1, 'NUMBER', 5, '다음중 연남동에 있는 빵집을 선택해주세요.', 'Y'),
--     (0, 1, 'NUMBER', 6, '여의도에 위치하고 치아바타 & 바게트로 유명한 빵집을 선택해주세요.', 'Y'),
--     (0, 1, 'NUMBER', 7, '아기궁뎅이빵을 최초로 만든 곳을 선택해주세요.', 'Y'),
--     (0, 1, 'NUMBER', 8, '다음중 한옥 빵집이 아닌곳을 선택해주세요.', 'Y'),
--     (0, 1, 'NUMBER', 9, '서울시 관악구에 위치하고 맘모스 빵으로 유명한 빵집을 선택해주세요.', 'Y'),
--     (0, 1, 'NUMBER', 10, '다음중 지점이 1개인 빵집을 선택해주세요.', 'Y'),
--     (0, 1, 'TEXT', 11, '서울에서 가장 오래된 빵집의 이름을 작성해주세요.', 'Y'),
--     (0, 1, 'TEXT', 12, '서울에서 가장 오래된 빵집이 위치한 곳은 어디인지 작성해주세요.(ex 서교동)', 'Y');


SELECT * FROM arirang_first.common_code;

SELECT * FROM arirang_first.answer;
-- INSERT INTO arirang_first.answer VALUES
-- 	(0, 1, 1, 1, '7122개', 'N', 'Y'),
-- 	(0, 1, 1, 2, '10759개', 'N', 'Y'),
-- 	(0, 1, 1, 3, '3888개', 'Y', 'Y'),
-- 	(0, 1, 1, 4, '21978개', 'N', 'Y'),
--     
-- 	(0, 1, 2, 1, '김영모 과자점', 'Y', 'Y'),
-- 	(0, 1, 2, 2, '나폴레옹 제과점', 'N', 'Y'),
-- 	(0, 1, 2, 3, '밀도', 'N', 'Y'),
-- 	(0, 1, 2, 4, '빵의정석', 'N', 'Y'),
-- 	
--     (0, 1, 3, 1, '옵스', 'N', 'Y'),
-- 	(0, 1, 3, 2, '이성당', 'N', 'Y'),
-- 	(0, 1, 3, 3, '카페 레이어드', 'Y', 'Y'),
-- 	(0, 1, 3, 4, '삼송빵집', 'N', 'Y'),
--     
-- 	(0, 1, 4, 1, '어글리베이커리', 'Y', 'Y'),
-- 	(0, 1, 4, 2, '뺑드포레', 'N', 'Y'),
-- 	(0, 1, 4, 3, '마린느', 'N', 'Y'),
-- 	(0, 1, 4, 4, '성심당', 'N', 'Y'),
--     
-- 	(0, 1, 5, 1, '쿄베이커리', 'Y', 'Y'),
-- 	(0, 1, 5, 2, '키에리', 'N', 'Y'),
-- 	(0, 1, 5, 3, '위티스위티', 'N', 'Y'),
-- 	(0, 1, 5, 4, '쉐프조', 'N', 'Y'),
-- 	
--     (0, 1, 6, 1, '폴앤폴리나', 'Y', 'Y'),
-- 	(0, 1, 6, 2, '포곤포곤', 'N', 'Y'),
-- 	(0, 1, 6, 3, '효자베이커리', 'N', 'Y'),
-- 	(0, 1, 6, 4, '무화당베이커리', 'N', 'Y'),
-- 	
--     (0, 1, 7, 1, '피터팬1978', 'Y', 'Y'),
-- 	(0, 1, 7, 2, '르알래스카', 'N', 'Y'),
-- 	(0, 1, 7, 3, '아우어베이커리', 'N', 'Y'),
-- 	(0, 1, 7, 4, '노아베이커리', 'N', 'Y'),
-- 	
--     (0, 1, 8, 1, '어니언 안국역점', 'N', 'Y'),
-- 	(0, 1, 8, 2, '북한산 제빵소 ', 'N', 'Y'),
-- 	(0, 1, 8, 3, '러스크베이커리', 'Y', 'Y'),
-- 	(0, 1, 8, 4, '감꽃당', 'N', 'Y'),
-- 	
--     (0, 1, 9, 1, '아오이토리', 'N', 'Y'),	
--     (0, 1, 9, 2, '알페도', 'N', 'Y'),
-- 	(0, 1, 9, 3, '끼룩하우스', 'N', 'Y'),
-- 	(0, 1, 9, 4, '장블랑제리', 'Y', 'Y'),
-- 	
--     (0, 1, 10, 1, '피오니', 'N', 'Y'),
-- 	(0, 1, 10, 2, '피치베이커리', 'Y', 'Y'),
-- 	(0, 1, 10, 3, '밀도', 'N', 'Y'),
-- 	(0, 1, 10, 4, '빵샘', 'N', 'Y'),

-- 	(0, 1, 11, 1, '태극당', 'Y', 'Y'),	
--     (0, 1, 12, 1, '장충동', 'Y', 'Y');
    
    
    
SELECT * FROM arirang_first.certificate;
-- insert into arirang_first.certificate values
-- 	(0, 1, 1, null, '빵지순례좌', null, 0.0),
-- 	(0, 1, 2, null, '빵린이', null, 0.0),
-- 	(0, 1, 9, null, '인증서 발급 실패', null, 0.0);



## 메인
select * from tests where test_id = 1;

## 질문지 조회
select * from questions q
	left join answers a on q.question_id = a.question_id
    where 
    q.use_yn = 'Y' 
    and a.use_yn = 'Y'
    and q.test_id = 1
    and a.test_id = 1;

## 결과 저장
select * from result;


## 정답 조회
select question_id, answer from answers where test_id = 1 and right_yn = 'Y';

select * from questions q
	left join answers a on q.question_id = a.question_id
    where 
    q.use_yn = 'Y' 
    and a.use_yn = 'Y'
    and q.test_id = 1
    and a.test_id = 1
    and a.right_yn = 'Y';


## 인증서 조회
select * from certificate;
select * from certificate 
	where test_id = 1
    and standard_cnt <= 6
    order by level
    limit 1;








    