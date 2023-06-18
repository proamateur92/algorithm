# 1. 회원 중 리뷰가 가장 많은 수를 리턴하는 서브쿼리
# 2. 해당 서브쿼리의 결과 값으로 결과 출력
# 3. 회원과 리뷰 컬럼을 SELECT 하므로 JOIN 처리하기
# 4. 정렬 조건 처리 (리뷰 작성일 오름차, 리뷰 텍스트 오름차)

SELECT 
    MP.MEMBER_NAME, 
    RR.REVIEW_TEXT, 
    DATE_FORMAT(REVIEW_DATE, '%Y-%m-%d') AS REVIEW_DATE
FROM MEMBER_PROFILE MP
INNER JOIN REST_REVIEW RR
ON MP.MEMBER_ID = RR.MEMBER_ID
WHERE MP.MEMBER_ID IN (
    # 가장 많은 리뷰 갯수인 MEMBER_ID 추출
    SELECT MEMBER_ID 
    FROM REST_REVIEW
    GROUP BY MEMBER_ID
    HAVING COUNT(*) = (
        # 가장 많은 리뷰 갯수 추출
        SELECT COUNT(*) AS CNT
        FROM REST_REVIEW
        GROUP BY MEMBER_ID
        ORDER BY CNT DESC
        LIMIT 1
    )
)
ORDER BY RR.REVIEW_DATE, RR.REVIEW_TEXT;